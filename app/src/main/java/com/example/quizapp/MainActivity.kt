package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var edtName: EditText? = null
    private var btnStart: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
        setOnClick()
    }

    private fun initializeView() {
        edtName = findViewById(R.id.edt_activity_main_name)
        btnStart = findViewById(R.id.btn_activity_main_start)
    }

    private fun setOnClick() {
        btnStart?.setOnClickListener {
            if (edtName?.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, edtName?.text.toString())
                startActivity(intent)
                finish()
            }

        }
    }
}