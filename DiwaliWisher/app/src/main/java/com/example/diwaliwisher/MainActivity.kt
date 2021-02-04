package com.example.diwaliwisher

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

    fun CreateDiwaliCard(view: View) {

        val name = nameOfPerson.editableText.toString()

        val intent= Intent(this, Greetings::class.java)

        intent.putExtra(Greetings.Name_is, name)
        startActivity(intent)
    }
}