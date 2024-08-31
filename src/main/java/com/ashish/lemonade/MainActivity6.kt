package com.ashish.lemonade

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    lateinit var next6: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        next6=findViewById(R.id.imageButton4)
        next6.setOnClickListener {
            val indent= Intent(this,MainActivity::class.java)
            startActivity(indent as Intent?)
        }

    }
}