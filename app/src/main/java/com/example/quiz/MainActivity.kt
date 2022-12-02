package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Раздел знаний")
    }

    fun Onclick(view: View) {
        val intent: Intent = Intent(this@MainActivity,AboutProgramActivity::class.java)
        startActivity(intent)
    }

    fun Onclick2(view: View) {
        val intent: Intent = Intent(this@MainActivity,QuestionFirstActivity::class.java)
        startActivity(intent)
    }
}