package com.example.mobilproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var gameName:String = intent.getStringExtra("gameName").toString()
        var gameImage: Int = intent.getIntExtra("gameImage",0)
        var string:TextView = findViewById(R.id.textView5)

        var image:ImageView = findViewById(R.id.imageView2)

        image.setImageResource(gameImage)

        string.text = gameName


        supportActionBar!!.setDisplayHomeAsUpEnabled(true)








    }
}