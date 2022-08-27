package com.example.quizforinterview

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quizforinterview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.btnStart.setOnClickListener{
            if (binding.etName.text.toString().isEmpty()){
                Toast.makeText(this, "Enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }




    }
}