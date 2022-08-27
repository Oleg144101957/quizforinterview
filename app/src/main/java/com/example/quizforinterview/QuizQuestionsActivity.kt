package com.example.quizforinterview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizforinterview.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizQuestionsBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val questionsList = Constants.getQuestions()

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition-1]

        binding.progressBar.progress = currentPosition
        val textProgress: String = "$currentPosition" + "/" + "${binding.progressBar.max}"
        binding.tvProgressText.text = textProgress
        binding.tvQuestion.text = question!!.question
        binding.flagImage.setImageResource(question.image)
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour


    }
}