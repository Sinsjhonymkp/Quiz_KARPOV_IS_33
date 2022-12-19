package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_result3.*
import kotlinx.android.synthetic.main.activity_result3.btn_finish4
import kotlinx.android.synthetic.main.activity_result3.tv_score

class ResultActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result4)
        setTitle("Финал викторины по истории")
        val totalQuestions = intent.getIntExtra(Constants4.TOTAL_QUESTIONS4, 0)
        val correctAnswers3 = intent.getIntExtra(Constants4.CORRECT_ANSWERS4, 0)
        val ans = correctAnswers3.toString()

        if(correctAnswers3 <= 3 ) {
            mark4.setImageResource(R.drawable.bad1)
        }
        if(correctAnswers3 in 4..7){
            mark4.setImageResource(R.drawable.normmark)
        }
        if(correctAnswers3 in 7..10) {
            mark4.setImageResource(R.drawable.great)
        }




        tv_score.text = "Твой счет $correctAnswers3 из $totalQuestions."


        btn_finish4.setOnClickListener {



            intent = Intent(this@ResultActivity4, MainActivity::class.java)
            intent.putExtra("stat4", ans)
            startActivity(intent)
            finish()
        }

    }


}