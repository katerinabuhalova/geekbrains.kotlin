package com.example.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "Hello!", Toast.LENGTH_SHORT).show()
        }

        val textView: TextView = findViewById(R.id.text)
        var cat = Cat()
        var output = "name = " + cat.name + ", age = " + cat.age
        textView.text = output

        val textView1: TextView = findViewById(R.id.textCopy)
        val newCat = TestObjectClass.getCopy()
        textView1.text = "name = " + newCat.name + ", age = " + newCat.age

        when (cat.name) {
            "Bax" -> println("Это мой кот!")
            "Мурзик" -> println("Это мой второй  кот!")
            else -> println("Это не мой кот!")
        }
        if (cat.name == "Bax") {
            println("Это мой кот!")
        } else {
            println("Не мой кот!")
        }

        for (i in 1..10) {
            println("Hello!$i")
        }

        for (i in 10 downTo 1 step 2) {
            print("Hello!$i")
        }

        var myList = listOf(11, 22, 33, 44, 55)
        for (i in myList.indices) {
            print("Hello!$i")
        }
    }
}