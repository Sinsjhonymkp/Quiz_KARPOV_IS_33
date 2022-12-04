package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.btn_finish4
import kotlinx.android.synthetic.main.activity_result.tv_score
import kotlinx.android.synthetic.main.activity_result3.*

class ResultActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result3)
        setTitle("Финал викторины по математике")
        //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val totalQuestions = intent.getIntExtra(Constants3.TOTAL_QUESTIONS3, 0)
        val correctAnswers3 = intent.getIntExtra(Constants3.CORRECT_ANSWERS3, 0)
        val ans = correctAnswers3.toString()

        if(correctAnswers3 <= 3 ) {
            mark4.setImageResource(R.drawable.badmark)
        }
        if(correctAnswers3 in 4..7){
            mark4.setImageResource(R.drawable.normmark)
        }
        if(correctAnswers3 in 7..10) {
            mark4.setImageResource(R.drawable.wonderfulmark)
        }




        tv_score.text = "Твой счет $correctAnswers3 из $totalQuestions."


        btn_finish4.setOnClickListener {



            intent = Intent(this@ResultActivity3, MainActivity::class.java)
            intent.putExtra("stat3", ans)
            startActivity(intent)
            finish()
        }


    }
}

