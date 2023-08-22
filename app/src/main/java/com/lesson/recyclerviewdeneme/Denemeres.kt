package com.lesson.recyclerviewdeneme

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Denemeres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_denemeres)

        val sporIcerigi = intent.getStringExtra("sporIcerigi")
        val sporGorselListesi = intent.getIntExtra("sporGorselListesi", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, sporGorselListesi)

        val textView: TextView = findViewById(R.id.textView)
        val imageView: ImageView = findViewById(R.id.imageView)

        textView.text = sporIcerigi
        imageView.setImageBitmap(bitmap)
    }
}