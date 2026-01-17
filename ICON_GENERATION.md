# 图标生成说明

## 已更新的文件

以下矢量图标文件已更新为新的"登峰影视"设计：

- `app/src/main/res/drawable/ic_launcher_foreground.xml` - 前景图标（山峰+播放按钮）
- `app/src/main/res/drawable/ic_launcher_background.xml` - 背景渐变
- `app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml` - Adaptive Icon配置
- `app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml` - 圆形Adaptive Icon配置
- `other/image/logo-1.svg` - Logo SVG版本1
- `other/image/logo-2.svg` - Logo SVG版本2

## 生成PNG图标文件

### 方法1：使用Android Studio（推荐）

1. 在Android Studio中，右键点击 `app/src/main/res` 文件夹
2. 选择 `New > Image Asset`
3. 在 `Foreground Layer` 中选择 `Image`，选择 `ic_launcher_foreground.xml`
4. 在 `Background Layer` 中选择 `Color` 或 `Image`，选择 `ic_launcher_background.xml`
5. 点击 `Next` 和 `Finish`
6. Android Studio会自动生成所有尺寸的PNG和WebP文件

### 方法2：使用在线工具

1. 访问 https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html
2. 上传 `ic_launcher_foreground.xml` 作为前景
3. 设置背景颜色为 `#E3F2FD` 或上传背景图片
4. 下载生成的图标包
5. 替换 `app/src/main/res/mipmap-*/` 目录下的相应文件

### 方法3：使用命令行工具（需要安装ImageMagick）

```bash
# 将SVG转换为PNG（需要先安装inkscape或rsvg-convert）
# 示例命令（需要根据实际情况调整）
```

## 图标设计说明

新图标设计包含以下元素：
- **山峰**：代表"登峰"，使用蓝色渐变
- **播放按钮**：代表"影视"，白色圆形背景上的蓝色三角形
- **装饰星星**：金色星星增加视觉吸引力
- **天空渐变背景**：浅蓝色渐变营造天空感

## 颜色方案

- 主蓝色：#1565C0
- 浅蓝色：#1976D2, #42A5F5
- 背景渐变：#E3F2FD → #BBDEFB → #90CAF9
- 装饰金色：#FFC107
- 白色：#FFFFFF
