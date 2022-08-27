package com.example.quizforinterview

object Constants{
    const val qustionText = "What country does this flag belong to?"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question = qustionText,
            R.drawable.arg,
            "Argentina",
            "Australia",
            "Belgium",
            "Canada",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            id = 2,
            question = qustionText,
            R.drawable.australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Fiji",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            id = 3,
            question = qustionText,
            R.drawable.belgium,
            "Argentina",
            "Australia",
            "Armenia",
            "Belgium",
            4
        )

        questionsList.add(que3)

        val que4 = Question(
            id = 4,
            question = qustionText,
            R.drawable.brazil,
            "Fiji",
            "Brazil",
            "Armenia",
            "Canada",
            2
        )

        questionsList.add(que4)

        val que5 = Question(
            id = 5,
            question = qustionText,
            R.drawable.de,
            "Ukraine",
            "France",
            "Norway",
            "Germany",
            4
        )

        questionsList.add(que5)

        val que6 = Question(
            id = 6,
            question = qustionText,
            R.drawable.denmark,
            "Denmark",
            "France",
            "India",
            "Pakistan",
            1
        )

        questionsList.add(que6)

        val que7 = Question(
            id = 7,
            question = qustionText,
            R.drawable.fiji,
            "Australia",
            "Egypt",
            "Fiji",
            "New Zeland",
            3
        )

        questionsList.add(que7)

        val que8 = Question(
            id = 8,
            question = qustionText,
            R.drawable.india,
            "Thailand",
            "Kuwait",
            "India",
            "Indonesia",
            3
        )

        questionsList.add(que8)

        val que9 = Question(
            id = 9,
            question = qustionText,
            R.drawable.kuwait,
            "Kuwait",
            "Lebanon",
            "India",
            "Indonesia",
            1
        )

        questionsList.add(que9)

        val que10 = Question(
            id = 10,
            question = qustionText,
            R.drawable.lebanon,
            "Thailand",
            "Indonesia",
            "Lebanon",
            "Kuwait",
            3
        )

        questionsList.add(que10)

        val que11 = Question(
            id = 11,
            question = qustionText,
            R.drawable.newze,
            "Fiji",
            "New Zeland",
            "Lebanon",
            "Armenia",
            2
        )

        questionsList.add(que11)

        val que12 = Question(
            id = 12,
            question = qustionText,
            R.drawable.ua,
            "France",
            "Germany",
            "EU",
            "Ukraine",
            4
        )

        questionsList.add(que12)

        val que13 = Question(
            id = 13,
            question = qustionText,
            R.drawable.usa,
            "Canada",
            "Germany",
            "USA",
            "Kuwait",
            3
        )

        questionsList.add(que13)

        val que14 = Question(
            id = 14,
            question = qustionText,
            R.drawable.zimbabve,
            "Argentina",
            "Zimbabwe",
            "New Zeland",
            "Fiji",
            2
        )

        questionsList.add(que14)




        return questionsList
    }


}