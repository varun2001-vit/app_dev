package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun createBirthdayCard(view: View) {
        val name=nameinput.editableText.toString()
       val intent=Intent(this,greet::class.java)
        Toast.makeText(this,"button dub gaya",Toast.LENGTH_LONG).show()
        intent.putExtra("name",name)
        startActivity(intent)
    }


}