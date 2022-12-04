package com.example.quiz

object  Constants2 {
    const val TOTAL_QUESTIONS2: String = "total_questions2"
    const val CORRECT_ANSWERS2: String = "correct_answers2"

    fun getQuestions2(): ArrayList<Question2> {
        val questionsList = ArrayList<Question2>()

        val que1 = Question2(
            1, "Клетки",
            "Какой рнк нет в природе",
            "Р-Рнк", "Л-рнк",
            "М-рнк", "Т-рнк", 2
        )

        questionsList.add(que1)

        val que2 = Question2(
            2, "Животные",
            "У какого животного есть киль? ",
            "Курицы", "Акулы",
            "Утконос", "Хорек", 1
        )
        questionsList.add(que2)

        val que3 = Question2(
            3, "Клетки",
            "Вирус это -",
            "Клеточная форма жизни", "Бактерия",
            "Гриб", "Неклеточная форма жизни", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question2(
            4, "Растения",
            "Лишайник это симбиоз",
            "Мха и гриба", "Мха и водоросли",
            "Гриба и водоросли", "Мха и голосеменного", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question2(
            5, "Генетика",
            "Синдром Эдвардса это",
            "моносомия по x хромосоме", "трисомия по 21 хромосоме",
            "полисомия по x хромосоме", "трисомия по 18", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question2(
            6, "Клетки",
            "Энергия в клетке\n запасается в виде",
            "АТФ", "кДж",
            "АНФ", "НТФ", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question2(
            7, "Наука",
           "Микология-это наука о",
            "Птицах", "Рыбах",
            "Грибах", "Водрослях", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question2(
            8, "Насекомые",
            "Бражники - это?",
            "Пауки", "Бабочки",
            "Гусеницы", "Стрекозы", 2
        )

        questionsList.add(que8)

        // 9
        val que9 = Question2(
            9, "Паразиты",
            "Промежуточный хозяин печёночного сосальщика",
            "Малый прудовик", "Корова",
            "Человек", "Кошка", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question2(
            10, "Животные",
           "Какое животное имеют не симметричные тело?",
            "Морская звезда", "Мидии",
            "Брюхоногий моллюск", "Двухстворчатые моллюски", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}