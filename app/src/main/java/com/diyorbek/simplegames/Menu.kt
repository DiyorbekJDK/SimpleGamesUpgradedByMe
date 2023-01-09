package com.diyorbek.simplegames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button1: MaterialButton = findViewById(R.id.btnStartDiceGame)
        val button2: MaterialButton = findViewById(R.id.btnStartRotateBottle)
        button1.setOnClickListener {
            //val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            startActivity(Intent(this, EnterName::class.java))
        }
        button2.setOnClickListener {
            val intent2 = Intent(this, BoardActivity::class.java)
            startActivity(intent2)
        }

    }
}