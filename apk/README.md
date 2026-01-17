# 应用更新文件说明

## 文件结构

此目录用于存放应用更新相关的文件：

- `mobile.json` - 移动版版本信息
- `leanback.json` - TV版版本信息
- `mobile-arm64_v8a.apk` - 移动版APK（arm64架构）
- `mobile-armeabi_v7a.apk` - 移动版APK（arm32架构）
- `leanback-arm64_v8a.apk` - TV版APK（arm64架构）
- `leanback-armeabi_v7a.apk` - TV版APK（arm32架构）

## JSON文件格式

```json
{
  "name": "版本名称（如：5.1.4）",
  "desc": "更新描述，支持\\n换行",
  "code": 版本号（必须大于当前版本号513）
}
```

## 更新流程

1. 编译应用生成APK文件
2. 更新JSON文件中的版本信息（code必须递增）
3. 将APK文件上传到此目录
4. 提交到GitHub仓库

## 注意事项

- 版本号（code）必须大于当前应用版本号才会提示更新
- 当前应用版本号：513（5.1.3）
- 更新地址：`https://raw.githubusercontent.com/Young0417/TVBOX_Android_fongmi/main/apk/`
