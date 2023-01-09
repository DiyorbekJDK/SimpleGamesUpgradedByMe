package com.diyorbek.simplegames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.diyorbek.simplegames.models.User
import com.google.android.material.button.MaterialButton

class EnterName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_name)

        val btn: MaterialButton = findViewById(R.id.btnStartThisGame)
        btn.setOnClickListener {
            val firstPlayerName: EditText = findViewById(R.id.firstPlayerNAme)
            val secondPlayerName: EditText = findViewById(R.id.secondPlayerNAme)
            val infoIntent = Intent(this, MainActivity::class.java)
            val user = User(
                firstPlayerName.text.toString().trim(),
                secondPlayerName.text.toString().trim()
            )
            val bundle = Bundle()
            bundle.putSerializable("user", user)
            infoIntent.putExtras(bundle)
            startActivity(infoIntent)
        }
    }
}