package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * EditText 演示 Activity
 * 展示如何在 Android 中获取用户输入的文本
 */
class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化组件
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        // 设置按钮点击监听器
        button.setOnClickListener {
            // 获取 EditText 中的文本内容
            val inputText = editText.text.toString()

            if (inputText.isNotEmpty()) {
                // 显示输入的内容
                textView.text = "你输入的是: $inputText"
            } else {
                // 提示用户输入内容
                Toast.makeText(this, "请先输入一些内容", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
