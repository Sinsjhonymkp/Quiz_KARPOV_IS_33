package com.example.quiz

import com.example.quiz.Question
import com.example.quiz.R

object  Constants {
// TODO (STEP 1: Create a constant variables which we required in the result screen.)
// START
//const val USER_NAME: String = "user_name"
const val TOTAL_QUESTIONS: String = "total_questions"
const val CORRECT_ANSWERS: String = "correct_answers"
// END

fun getQuestions(): ArrayList<Question> {
    val questionsList = ArrayList<Question>()

    // 1
    val que1 = Question(
        1, "флаг какой страны изображён ниже?",
        R.drawable.belarus,
        "Беларусь", "Англия",
        "Словакия", "Чехия", 1
    )

    questionsList.add(que1)

    // 2
    val que2 = Question(
        2, "флаг какой страны изображён ниже?",
        R.drawable.chech,
        "Румыния", "Ангола",
        "Чехия", "Узбекистан", 3
    )

    questionsList.add(que2)

    // 3
    val que3 = Question(
        3, "флаг какой страны изображён ниже?",
        R.drawable.russia,
        "Америка", "Англия",
        "Дания", "Россия", 4
    )

    questionsList.add(que3)

    // 4
    val que4 = Question(
        4, "флаг какой страны изображён ниже?",
        R.drawable.spain,
        "Нигерия", "Испания",
        "Франция", "Тунис", 2
    )

    questionsList.add(que4)

    // 5
    val que5 = Question(
        5, "флаг какой страны изображён ниже?",
        R.drawable.france,
        "Италия", "Португалия",
        "Франция", "Исландия", 3
    )

    questionsList.add(que5)

    // 6
    val que6 = Question(
        6, "флаг какой страны изображён ниже",
        R.drawable.german,
        "Германия", "Сербия",
        "Новая-Гвинея", "Эфиопия", 1
    )

    questionsList.add(que6)

    // 7
    val que7 = Question(
        7, "флаг какой страны изображён ниже?",
        R.drawable.china,
        "Япония", "Корея",
        "Китай", "Эритрея", 3
    )

    questionsList.add(que7)

    // 8
    val que8 = Question(
        8, "флаг какой страны изображён ниже?",
        R.drawable.kazakhstan,
        "Турция", "Иран",
        "Уэльс", "Казахстан", 4
    )

    questionsList.add(que8)

    // 9
    val que9 = Question(
        9, "флаг какой страны изображён ниже",
        R.drawable.georgia,
        "Австралия", "Грузия",
        "Гваделупа", "Америка", 2
    )

    questionsList.add(que9)

    // 10
    val que10 = Question(
        10, "флаг какой страны изображён ниже?",
        R.drawable.mexico,
        "Мексика", "Грузия",
        "Судан", "Финляндия", 1
    )

    questionsList.add(que10)

    return questionsList
}
}