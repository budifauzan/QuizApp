package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var tvName: TextView? = null
    private var tvScore: TextView? = null
    private var btnFinish: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initializeViews()
        setViewFromIntent()
        setOnClick()
    }

    private fun initializeViews() {
        tvName = findViewById(R.id.tv_activity_result_name)
        tvScore = findViewById(R.id.tv_activity_result_score)
        btnFinish = findViewById(R.id.btn_activity_result_finish)
    }

    private fun setViewFromIntent() {
        tvName?.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore?.text = "Your score is ${intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)}" +
                " out of ${intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)}"
    }

    private fun setOnClick() {
        btnFinish?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}