package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<QuestionModel> {
        val questions = ArrayList<QuestionModel>()
        questions.add(
            QuestionModel(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Indonesia",
                "Argentina",
                "India",
                "Canada",
                2
            )
        )
        questions.add(
            QuestionModel(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                "Australia",
                "Turkey",
                "Italy",
                "Zimbabwe",
                1
            )
        )
        questions.add(
            QuestionModel(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                "Dubai",
                "Malaysia",
                "Singapore",
                "Belgium",
                4
            )
        )
        questions.add(
            QuestionModel(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "France",
                "Brazil",
                "Germany",
                "Uruguay",
                2
            )
        )
        questions.add(
            QuestionModel(
                5,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                "Kuwait",
                "Philipine",
                "Denmark",
                "New Zealand",
                3
            )
        )
        questions.add(
            QuestionModel(
                6,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_fiji,
                "Fiji",
                "Indonesia",
                "Taiwan",
                "Mexico",
                1
            )
        )
        questions.add(
            QuestionModel(
                7,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_germany,
                "Qatar",
                "Vietnam",
                "England",
                "Germany",
                4
            )
        )
        questions.add(
            QuestionModel(
                8,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_india,
                "India",
                "Qatar",
                "Russia",
                "Canada",
                1
            )
        )
        questions.add(
            QuestionModel(
                9,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                "Palestine",
                "Indonesia",
                "Kuwait",
                "Monaco",
                3
            )
        )
        questions.add(
            QuestionModel(
                10,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                "United States",
                "New Zealand",
                "Japan",
                "South Korea",
                2
            )
        )

        return questions
    }
}