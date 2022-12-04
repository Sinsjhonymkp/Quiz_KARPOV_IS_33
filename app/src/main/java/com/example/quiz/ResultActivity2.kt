package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_result.btn_finish4
import kotlinx.android.synthetic.main.activity_result.tv_score
import kotlinx.android.synthetic.main.activity_result2.*
import kotlinx.android.synthetic.main.activity_result3.*

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        setTitle("Финал викторины по биологии")
        //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val totalQuestions = intent.getIntExtra(Constants2.TOTAL_QUESTIONS2, 0)
        val correctAnswers2 = intent.getIntExtra(Constants2.CORRECT_ANSWERS2, 0)
        val ans = correctAnswers2.toString()

        if(correctAnswers2 <= 3 ) {
            mark2.setImageResource(R.drawable.badmarkb)
        }
        if(correctAnswers2 in 4..7){
            mark2.setImageResource(R.drawable.normmarkb)
        }
        if(correctAnswers2 in 7..10) {
            mark2.setImageResource(R.drawable.wonderfulmarkb)
        }

        tv_score.text = "Твой счет $correctAnswers2 из $totalQuestions."


        btn_finish4.setOnClickListener {


            intent = Intent(this@ResultActivity2, MainActivity::class.java)
            intent.putExtra("stat2", ans)
            startActivity(intent)
            finish()

        }


    }
}
