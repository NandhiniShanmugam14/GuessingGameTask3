package com.example.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secretInputValue = findViewById<EditText>(R.id.secredNumber)
        val guessInputValue = findViewById<TextInputLayout>(R.id.guess)
        val clickMeButton = findViewById<TextView>(R.id.clickEvent)
        val displayGuessResult = findViewById<TextView>(R.id.displayresult)

        clickMeButton.setOnClickListener {
            val actualInputValue = guessInputValue.editText?.text?.toString()?.toInt()
            val actualSecretKey = secretInputValue.text?.toString()?.toInt()
            val result =
                if(actualInputValue!! > actualSecretKey!!) "No :) My number is smaller"
                else if(actualInputValue!! < actualSecretKey) "No :) My number is bigger"
                else "You are right!"

            displayGuessResult.text = "$result"
        }

    }
}