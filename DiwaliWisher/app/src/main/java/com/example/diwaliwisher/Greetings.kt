package com.example.diwaliwisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings.*

class Greetings : AppCompatActivity() {
    companion object{
        const val Name_is = "name_is"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        val name = intent.getStringExtra(Name_is)
        diwaliGreet.text = "Happy Diwali \n $name!"
    }
}