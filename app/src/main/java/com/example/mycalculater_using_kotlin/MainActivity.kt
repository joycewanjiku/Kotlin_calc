package com.example.mycalculater_using_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNumbers()
        subNumbers()
        multiplyNumbers()
        divideNumbers()
    }
    fun addNumbers() {
        var number1 = findViewById<TextView>(R.id.textView)
        var number2 = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.tilbtn_add)
        button.setOnClickListener {
            var sumfirst = number1.text.toString().toInt()
            var sumsecond = number2.text.toString().toInt()
            var output = sumfirst + sumsecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun subNumbers() {
        var number1 = findViewById<TextView>(R.id.button)
        var number2=findViewById<TextView>(R.id.button2)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var sub = number1.text.toString().toInt()
            var sub2 = number2.text.toString().toInt()
            var output = sub - sub2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplyNumbers() {
        var first = findViewById<TextView>(R.id.button)
        var second = findViewById<TextView>(R.id.button)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var multi = first.text.toString().toInt()
            var multi2 = second.text.toString().toInt()
            var output = multi * multi2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
    fun divideNumbers() {
        var first = findViewById<TextView>(R.id.button)
        var second = findViewById<TextView>(R.id.button)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var divide = first.text.toString().toInt()
            var divide2 = second.text.toString().toInt()
            var output = divide % divide2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

}

