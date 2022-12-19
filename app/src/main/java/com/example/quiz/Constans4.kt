package com.example.quiz

import com.example.quiz.Question
import com.example.quiz.R

object  Constants4 {

    const val TOTAL_QUESTIONS4: String = "total_questions"
    const val CORRECT_ANSWERS4: String = "correct_answers"

    fun getQuestions(): ArrayList<Question4> {
        val questionsList = ArrayList<Question4>()
        val que1 = Question4(
            1, "Исторические личности России",
            R.drawable.pushkin,
            "Достоевский", "Гоголь",
            "Шишкин", "Пушкин", 4
        )
        questionsList.add(que1)

        val que2 = Question4(
            2, "Исторические личности России",
            R.drawable.lenin,
            "Сталин", "Троцкий",
            "Ленин", "Хрущёв", 3
        )

        questionsList.add(que2)


        val que3 = Question4(
            3, "Исторические личности России",
            R.drawable.mendeleev,
            "Ломоносов", "Цилковский",
            "Лобачевский", "Менделеев", 4
        )

        questionsList.add(que3)

        val que4 = Question4(
            4, "Исторические личности России",
            R.drawable.petr1,
            "Николай 2", "Пётр 1",
            "Александр 3", "Иван 3", 2
        )

        questionsList.add(que4)

        val que5 = Question4(
            5, "Исторические личности России",
            R.drawable.esenin,
            "Есенин", "Пушкин",
            "Булгаков", "Лермонтов", 1
        )

        questionsList.add(que5)

        val que6 = Question4(
            6, "Исторические личности России",
            R.drawable.stalin,
            "Ленин", "Горбачёв",
            "Сталин", "Хрущёв", 3
        )

        questionsList.add(que6)

        val que7 = Question4(
            7, "Исторические личности России",
            R.drawable.gogol,
            "Толстой", "Чехов",
            "Тургенев", "Гоголь", 4
        )

        questionsList.add(que7)

        val que8 = Question4(
            8, "Исторические личности России",
            R.drawable.ivangr,
            "Иван 1", "Иван Грозный",
            "Федор 3", "Николай 2", 2
        )

        questionsList.add(que8)

        val que9 = Question4(
            9, "Исторические личности России",
            R.drawable.brejhnev,
            "Брежнев", "Андропов",
            "Сталин", "Горбачёв", 1
        )

        questionsList.add(que9)

        val que10 = Question4(
            10, "Исторические личности России",
            R.drawable.nikolai2,
            "Иван 4", "Николай 2",
            "Петр 1", "Александр 1", 2
        )

        questionsList.add(que10)

        return questionsList
    }
}
