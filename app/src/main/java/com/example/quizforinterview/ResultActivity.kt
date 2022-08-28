package com.example.quizforinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quizforinterview.databinding.ActivityResultBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private lateinit var mDatabase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater).also { setContentView(it.root) }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val userName = intent.getStringExtra(Constants.USER_NAME) ?: "unknown"
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        binding.tvName.text = userName
        binding.tvScore.text = "Your score is $correctAnswers out of $totalQuestions"

        mDatabase = FirebaseDatabase.getInstance().getReference(userName)

        val id = mDatabase.key
        val name = userName
        val info =binding.tvScore.text.toString()

        mDatabase.push().setValue("Game id $id name of user: $name score is: $info")

        binding.btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }



    }
}