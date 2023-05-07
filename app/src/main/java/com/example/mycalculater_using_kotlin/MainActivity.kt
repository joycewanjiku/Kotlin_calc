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
        var button = findViewById<Button>(R.id.tilbtnadd)
        button.setOnClickListener {
            var sumfirst = number1.text.toString().toDouble()
            var sumsecond = number2.text.toString().toDouble()
            var output = sumfirst + sumsecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun subNumbers() {
        var number1 = findViewById<TextView>(R.id.button)
        var number2=findViewById<TextView>(R.id.button6)
        var button = findViewById<Button>(R.id.button6)
        button.setOnClickListener {
            var sub = number1.text.toString().toDouble()
            var sub2 = number2.text.toString().toDouble()
            var output = sub - sub2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplyNumbers() {
        var first = findViewById<TextView>(R.id.button)
        var second = findViewById<TextView>(R.id.button)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var multi = first.text.toString().toDouble()
            var multi2 = second.text.toString().toDouble()
            var output = multi * multi2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
    fun divideNumbers() {
        var first = findViewById<TextView>(R.id.button)
        var second = findViewById<TextView>(R.id.button)
        var button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            var divide = first.text.toString().toDouble()
            var divide2 = second.text.toString().toDouble()
            var output = divide % divide2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

}

