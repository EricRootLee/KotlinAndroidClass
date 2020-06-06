package com.skylabs.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var username = intent.getStringExtra(Constants.USER_NAME)
        var correctAnswer = intent.getIntExtra(Constants.CORRECT_ANS, 0)
        var totalQ = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        when{
            correctAnswer < 5 -> tv_congratulations.text = "You Failed "
        }
        tv_name.text = username
        tv_score.text = "Your Score is $correctAnswer out of $totalQ"
        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}