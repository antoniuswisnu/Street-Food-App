package com.example.projekakhirpan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class Pilih : AppCompatActivity() {
    private lateinit var pilihan1: ImageView
    private lateinit var pilihan2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih)
        pilihan1 = findViewById(R.id.makanan)
        pilihan1.setOnClickListener {
            val intent1 = Intent(this, Makanan::class.java)
            startActivity(intent1)
        }
        pilihan2 = findViewById(R.id.minuman)
        pilihan2.setOnClickListener {
            val intent2 = Intent(this, Minuman::class.java)
            startActivity(intent2)
        }
    }}