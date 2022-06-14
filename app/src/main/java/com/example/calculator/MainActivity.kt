package com.example.calculator

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
    var resultat: Int = 0

    fun add(view: View) {
        resultat = numberOne.editableText.toString().toInt() + numberTwo.editableText.toString().toInt()
        result.text = resultat.toString()
        println(numberOne.text)
    }

    fun sous(view: View) {
        resultat = numberOne.editableText.toString().toInt() - numberTwo.editableText.toString().toInt()
        result.text = resultat.toString()
        println(numberOne.text)
    }

    fun mult(view: View) {
        resultat = numberOne.editableText.toString().toInt() * numberTwo.editableText.toString().toInt()
        result.text = resultat.toString()
        println(numberOne.text)
    }

    fun divide(view: View) {
        resultat = numberOne.editableText.toString().toInt() / numberTwo.editableText.toString().toInt()
        result.text = resultat.toString()
        println(numberOne.text)
    }
}