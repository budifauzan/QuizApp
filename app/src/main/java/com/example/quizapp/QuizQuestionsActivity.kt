package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

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
    private var selectedOption = 0

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
        tvQuestion?.text = questions[index].question
        ivImage?.setImageResource(questions[index].imageId)
        pbProgress?.progress = index + 1
        tvProgress?.text = "${index + 1}/${pbProgress?.max}"
        tvOption1?.text = questions[index].option1
        tvOption2?.text = questions[index].option2
        tvOption3?.text = questions[index].option3
        tvOption4?.text = questions[index].option4

        if (index == questions.size - 1) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun setOnClick() {
        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        tvOption1?.let {
            options.add(0, it)
        }
        tvOption2?.let {
            options.add(1, it)
        }
        tvOption3?.let {
            options.add(2, it)
        }
        tvOption4?.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.options_bg)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOption: Int) {
        defaultOptionsView()
        this.selectedOption = selectedOption
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.typeface = Typeface.DEFAULT_BOLD
        tv.background = ContextCompat.getDrawable(this, R.drawable.options_bg_selected)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_activity_quiz_option1 -> {
                tvOption1?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.tv_activity_quiz_option2 -> {
                tvOption2?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.tv_activity_quiz_option3 -> {
                tvOption3?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_activity_quiz_option4 -> {
                tvOption4?.let {
                    selectedOptionView(it, 4)
                }
            }
            R.id.btn_activity_quiz_submit -> {
                // TODO "implement submit"
            }
        }
    }

}