package com.example.mobilproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var ss:String = intent.getStringExtra("game").toString()

        var string:TextView = findViewById(R.id.textView4)

        string.text = ss




    }
}