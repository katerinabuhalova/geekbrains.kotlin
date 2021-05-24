package com.example.kotlin

object TestObjectClass {

    fun getCopy() : Cat{
        var cat = Cat()
        return cat.copy(name = "Мурзик")
    }
}