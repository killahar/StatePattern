package com.example.statepattern

import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var codeInput: EditText
    private lateinit var backgroundColor: View
    private lateinit var text: TextView
    private lateinit var buttonContext: ButtonContext


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.stateButton)
        codeInput = findViewById(R.id.codeInput)
        backgroundColor = findViewById(R.id.rootLayout)
        text = findViewById(R.id.text)

        buttonContext = ButtonContext(button, codeInput, backgroundColor, text)
    }
}