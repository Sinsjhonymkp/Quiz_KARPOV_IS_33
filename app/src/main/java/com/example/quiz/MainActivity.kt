package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_statistics.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Раздел знаний")
        val textView: TextView = findViewById(R.id.statView2)
        val arguments: Bundle? = intent.extras
        if (arguments != null){
            val name: String = arguments.get("stat").toString()
              textView.text = "Ваш последний результат: $name из 10"
        }

        }

    fun Onclick(view: View) {
        val intent: Intent = Intent(this@MainActivity,AboutProgramActivity::class.java)
        startActivity(intent)
    }

    fun Onclick2(view: View) {
        val intent: Intent = Intent(this@MainActivity,QuestionFirstActivity::class.java)
        startActivity(intent)
    }

    fun OnClick3(view: View) {
        val intent: Intent = Intent(this@MainActivity,QuestionSecondActivity::class.java)
        startActivity(intent)
    }

    fun OnClick4(view: View) {
        val intent: Intent = Intent(this@MainActivity,QuestionThirdActivity::class.java)
        startActivity(intent)
    }

    fun OnClick5(view: View) { val intent: Intent = Intent(this@MainActivity,StatisticsActivity::class.java)
        startActivity(intent)}


}