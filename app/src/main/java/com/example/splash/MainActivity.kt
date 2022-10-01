package com.example.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.dynamicanimation.animation.FlingAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val imageView = findViewById<ImageView> (R.id.imageView)

        imageView.setOnClickListener {
            imageView.animate().apply {
                duration = 2000
                rotationYBy(360f)
            }.start()
    }
        }
}