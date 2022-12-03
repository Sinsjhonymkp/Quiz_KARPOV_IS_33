package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setTitle("Финал викторины")
        //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val ans = correctAnswers.toString()



        tv_score.text = "Твой счет $correctAnswers из $totalQuestions."


        btn_finish.setOnClickListener {


            intent = Intent(this@ResultActivity, MainActivity::class.java)
            intent.putExtra("stat", ans)
            startActivity(intent)

        }


    }
}
