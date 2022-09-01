package com.mahesh_prajapati.kotlin_examples.scope_function


fun main() {

    val name: String? = "hello"

    // Execute the lambda expression only if the 'name' variable is NOT NULL
    val stringLength = name?.let {
       // Refer to context object by using 'it'
        println(it.reversed())
        println(it.capitalize())
        it.length
       // The return value is the 'lambda result'. Will be returned and stored within stringLength variable
    }

    println(stringLength)
}