# android-edittext-demo

## 简介

演示 EditText 组件的使用，获取用户输入的文本。

## 基本原理

- EditText 是可编辑的文本输入框
- 继承自 TextView，支持所有文本显示属性
- 通过 `text` 属性获取用户输入的内容

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 在文本框中输入内容
3. 点击按钮获取输入

## 教程

### EditText 基础

```xml
<EditText
    android:id="@+id/editText"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="请输入文字"
    android:inputType="text" />
```

### 获取输入文本

```kotlin
val editText = findViewById<EditText>(R.id.editText)

// 获取文本内容
val text = editText.text.toString()
```

### inputType 属性

inputType 属性控制输入的类型：

| 值 | 说明 |
|----|------|
| text | 普通文本 |
| number | 数字 |
| phone | 电话号码 |
| emailEmail | 电子邮件 |
| password | 密码 |

### 注意事项

- 使用 `hint` 属性显示提示文字
- 获取文本后要调用 `toString()` 转换为字符串
- `maxLines` 可以限制最大行数
