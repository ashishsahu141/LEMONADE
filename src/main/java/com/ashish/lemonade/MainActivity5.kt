package com.ashish.lemonade

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    lateinit var next7: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        next7=findViewById(R.id.imageButton3)
        next7.setOnClickListener {
            val indent= Intent(this,MainActivity6::class.java)
            startActivity(indent as Intent?)
        }

    }
}