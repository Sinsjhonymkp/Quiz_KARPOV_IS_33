package com.example.quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question_first.*

class historyQuestionActivity : AppCompatActivity(), View.OnClickListener  {
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question4>? = null

    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_question)
        setTitle("Викторина по географии")
        mQuestionsList = Constants4.getQuestions()
        setQuestion()
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tv_option_one -> {

                selectedOptionView(tv_option_one, 1)
            }

            R.id.tv_option_two -> {

                selectedOptionView(tv_option_two, 2)
            }

            R.id.tv_option_three -> {

                selectedOptionView(tv_option_three, 3)
            }

            R.id.tv_option_four -> {

                selectedOptionView(tv_option_four, 4)
            }

            R.id.btn_submit -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent =
                                Intent(this@historyQuestionActivity, ResultActivity4::class.java)
                            intent.putExtra(Constants4.CORRECT_ANSWERS4, mCorrectAnswers)
                            intent.putExtra(Constants4.TOTAL_QUESTIONS4, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()

                        }


                    }
                } else {
                    val question4 = mQuestionsList?.get(mCurrentPosition - 1)

                    if (question4!!.correctAnswer4 != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    else {
                        mCorrectAnswers++
                    }

                    answerView(question4.correctAnswer4, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "ЗАКОНЧИТЬ"
                    } else {
                        btn_submit.text = "СЛЕДУЮЩИЙ ВОПРОС"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }
    private fun setQuestion() {


        val question4 = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "ЗАКОНЧИТЬ"
        } else {
            btn_submit.text = "ПОДТВЕРДИТЬ"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.getMax()

        tv_question.text = question4.question4
        iv_image.setImageResource(question4.image4)
        tv_option_one.text = question4.optionOne4
        tv_option_two.text = question4.optionTwo4
        tv_option_three.text = question4.optionThree4
        tv_option_four.text = question4.optionFour4
    }


    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#ffff99")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@historyQuestionActivity,
            R.drawable.default_option_border_bg
        )
    }
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#f7f7f7"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@historyQuestionActivity,
                R.drawable.default_option_border_bg
            )
        }
    }
    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this@historyQuestionActivity,
                    drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this@historyQuestionActivity,
                    drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this@historyQuestionActivity,
                    drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this@historyQuestionActivity,
                    drawableView
                )
            }
        }
    }
}

