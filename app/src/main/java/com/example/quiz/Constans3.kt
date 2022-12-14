package com.example.quiz

object  Constants3 {
    const val TOTAL_QUESTIONS3: String = "total_questions3"
    const val CORRECT_ANSWERS3: String = "correct_answers3"

    fun getQuestions2(): ArrayList<Question3> {
        val questionsList = ArrayList<Question3>()

        val que1 = Question3(
            1, "Математика",
            "1% от 1000",
            "1000", "100",
            "1", "10", 4
        )

        questionsList.add(que1)

        val que2 = Question3(
            2, "Математика",
            "Чему равен 1 пуд? ",
            "16кг", "18кг",
            "10кг", "100кг", 1
        )
        questionsList.add(que2)

        val que3 = Question3(
            3, "Математика",
            "Утверждение\n принимаемое без док-ва",
            "Биссектриса", "Угол",
            "Аксиома", "Теорема", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question3(
            4, "Математика",
            "Какова 3 часть от 60?",
            "20", "15",
            "30", "10", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question3(
            5, "Математика",
            "Сколько граней у куба?",
            "8", "6",
            "4", "10", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question3(
            6, "Математика",
            "Сколько диагоналей\n можно провести в треугольнике?",
            "1", "2",
            "4", "0", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question3(
            7, "Математика",
            "Какое число\nделится на все числа без остатка?",
            "3", "2",
            "0", "10", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question3(
            8, "Математика",
            "Сколько ступенек\n у \nлестницы в которой \nсредняя ступенька 8?",
            "11", "16",
            "17", "15", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question3(
            9, "Математика",
            "Сколько диагоналей можно\n провести в четырехугольнике?",
            "3", "2",
            "4", "6", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question3(
            10, "Математика",
            "Сколько вершин у куба?",
            "6", "10",
            "4", "8", 4
        )

        questionsList.add(que10)

        return questionsList
    }
}