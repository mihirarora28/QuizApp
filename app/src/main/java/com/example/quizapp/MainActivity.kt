package com.example.quizapp

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.time.Duration


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn);
        val txt = findViewById<TextInputEditText>(R.id.txt1)
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN /// remove status bar
        btn.setOnClickListener {
            if (txt.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                ;
            }

        }
    }
}