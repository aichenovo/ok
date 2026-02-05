package com.fongmi.android.tv.utils;

import android.text.TextUtils;

import com.fongmi.android.tv.App;
import com.github.catvod.utils.Path;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigManager {

    private static final String TAG = ConfigManager.class.getSimpleName();
    private static final String CONFIG_FILE = "config.txt";
    private static final String DEFAULT_URL = "http://www.饭太硬.com/tv";

    private static class Loader {
        static volatile ConfigManager INSTANCE = new ConfigManager();
    }

    public static ConfigManager get() {
        return Loader.INSTANCE;
    }

    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    public String getDefaultUrl() {
        return getDefaultUrl(CONFIG_FILE);
    }

    public String getDefaultUrl(String fileName) {
        if (cache.containsKey(fileName)) {
            return cache.get(fileName);
        }

        String url = readFromExternalStorage(fileName);
        if (TextUtils.isEmpty(url)) {
            url = readFromAssets(fileName);
        }
        if (TextUtils.isEmpty(url)) {
            url = DEFAULT_URL;
        }

        url = url.trim();
        cache.put(fileName, url);
        return url;
    }

    public void clearCache() {
        cache.clear();
    }

    private String readFromExternalStorage(String fileName) {
        File file = Path.files(fileName);
        if (file.exists() && file.canRead()) {
            try {
                return FileUtil.readTextFile(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private String readFromAssets(String fileName) {
        try (InputStream is = App.get().getAssets().open(fileName)) {
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            return new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
