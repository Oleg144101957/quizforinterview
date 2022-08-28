package com.example.quizforinterview

object Constants{
    const val QUESTION_TEXT = "What country does this flag belong to?"
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "tottal_questions"
    const val CORRECT_ANSWERS: String = "correct_ansvers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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
            question = QUESTION_TEXT,
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