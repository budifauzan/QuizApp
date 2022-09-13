package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class QuizQuestionsActivity : AppCompatActivity() {

    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null
    private var pbProgress: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvOption1: TextView? = null
    private var tvOption2: TextView? = null
    private var tvOption3: TextView? = null
    private var tvOption4: TextView? = null
    private var btnSubmit: Button? = null

    private val questions = Constants.getQuestions()
    private var index = 0
    private var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        initializeViews()
        setViews()
        setOnClick()
    }

    private fun initializeViews() {
        tvQuestion = findViewById(R.id.tv_activity_quiz_question)
        ivImage = findViewById(R.id.iv_activity_quiz_image)
        pbProgress = findViewById(R.id.pb_activity_quiz_progress)
        tvProgress = findViewById(R.id.tv_activity_quiz_progress)
        tvOption1 = findViewById(R.id.tv_activity_quiz_option1)
        tvOption2 = findViewById(R.id.tv_activity_quiz_option2)
        tvOption3 = findViewById(R.id.tv_activity_quiz_option3)
        tvOption4 = findViewById(R.id.tv_activity_quiz_option4)
        btnSubmit = findViewById(R.id.btn_activity_quiz_submit)
    }

    private fun setViews() {
        if (index < 10) {
            tvQuestion?.text = questions[index].question
            ivImage?.setImageResource(questions[index].imageId)
            pbProgress?.progress = index + 1
            tvProgress?.text = "${index + 1}/${pbProgress?.max}"
            tvOption1?.text = questions[index].option1
            tvOption2?.text = questions[index].option2
            tvOption3?.text = questions[index].option3
            tvOption4?.text = questions[index].option4
            index++
        } else {
            Toast.makeText(this, "Done!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setOnClick() {
        btnSubmit?.setOnClickListener {
            setViews()
        }

    }
}