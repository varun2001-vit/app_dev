package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greet.*
import kotlinx.android.synthetic.main.activity_greet.view.*

class greet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
        val name=intent.getStringExtra("name")
        textView.text="HAPPY BITRHDAY LODU $name!"
    }
}