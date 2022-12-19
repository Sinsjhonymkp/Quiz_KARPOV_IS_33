package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_about_program.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Раздел знаний")
        val name = intent.getStringExtra("stat")
        if(name != null)
      //  val textView: TextView = findViewById(R.id.statView2)
        //val arguments: Bundle? = intent.extras
       // if (arguments != null) {
           // val name: String = arguments.get("stat").toString()
            statView2.text = " Ваш результат в разделе география:\n$name/10"
       else {

        }
        val name2 = intent.getStringExtra("stat2")
        if (name2 != null)
        statView2.text = " Ваш результат в разделе биология:\n$name2/10"
        else{}
        val name3 = intent.getStringExtra("stat3")
        if(name3 != null)
        statView2.text = " Ваш результат в разделе математика:\n" +
                "$name3/10"
        else{ }
        val name4 = intent.getStringExtra("stat4")
        if(name4 != null)
            statView2.text = " Ваш результат в разделе история:\n" +
                    "$name4/10"
        else{ }




        //    val textView2: TextView = findViewById(R.id.statView3)
           // val name2: String = arguments.get("stat2").toString()
          //  textView2.text = "$name2/10"


          //  val textView3: TextView = findViewById(R.id.statView4)

         //   val name3: String = arguments.get("stat3").toString()
         //   textView3.text = "$name3/10"


       // }





        }

        fun Onclick(view: View) {
            val intent: Intent = Intent(this@MainActivity, AboutProgramActivity::class.java)
            startActivity(intent)
        }

        fun Onclick2(view: View) {
            val intent: Intent = Intent(this@MainActivity, QuestionFirstActivity::class.java)
            startActivity(intent)
        }

        fun OnClick3(view: View) {
            val intent: Intent = Intent(this@MainActivity, QuestionSecondActivity::class.java)
            startActivity(intent)
        }

        fun OnClick4(view: View) {
            val intent: Intent = Intent(this@MainActivity, QuestionThirdActivity::class.java)
            startActivity(intent)
        }
    fun onClick5 (view: View){
        val intent: Intent = Intent (this@MainActivity,historyQuestionActivity::class.java)
        startActivity(intent)
    }
             }


