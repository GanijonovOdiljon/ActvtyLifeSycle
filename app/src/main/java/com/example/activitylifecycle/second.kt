package com.example.activitylifecycle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class second : AppCompatActivity() {
    private lateinit var counter: Button
    private lateinit var textViw: TextView
    private var count = 0
    private lateinit var clear: Button
    private val sharedPref by lazy { SharePrefManeger(this) }

@SuppressLint("MissingInflatedId")
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)

    textViw = findViewById(R.id.text5)
    counter = findViewById(R.id.counte)
    clear = findViewById(R.id.button2)


    textViw.text = sharedPref.getCount().toString()
    count = sharedPref.getCount()


    counter.setOnClickListener{
        count++
        textViw.text = count.toString()
        sharedPref.counter(count)
    }

    clear.setOnClickListener {
        sharedPref.clear()
        textViw.text = "0"
        count = 0
    }
}
}