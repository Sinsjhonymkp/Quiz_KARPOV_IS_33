package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutProgramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_program)
        setTitle("О программе")
    }
}