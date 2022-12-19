package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_result.view.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setTitle("Финал викторины по географии")
        //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val ans = correctAnswers.toString()

        if(correctAnswers <=5 ){
           mark1.setImageResource(R.drawable.bad1)
        }
        if(correctAnswers in  5..8){
            mark1.setImageResource(R.drawable.norm)
        }
        if(correctAnswers in  8..10){
            mark1.setImageResource(R.drawable.great)
        }




        tv_score.text = "Твой счет $correctAnswers из $totalQuestions."


        btn_finish4.setOnClickListener {


            intent = Intent(this@ResultActivity, MainActivity::class.java)
            intent.putExtra("stat", ans)
            startActivity(intent)
            finish()

        }


    }
}
