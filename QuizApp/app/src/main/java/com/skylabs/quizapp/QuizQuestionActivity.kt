package com.skylabs.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        val questionList = Constants.getQuestions()
        val currentPosition = 1
        val question : Question? = questionList[currentPosition - 1]

        progressbar.progress = currentPosition
        progressNumber.text = "$currentPosition " + "/" + progressbar.max

        tvQuestion.text = question!!.question
        iv_image.setImageResource(question.image)

        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour


     }



}
