@file:JvmName("MyCustomfileName")

package com.mahesh_prajapati.kotlin_examples.function.interoperability


    fun addition(a: Int, b: Int) {
        println("Kotlin addition result is" + (a + b))
    }

     fun main(arg: Array<String>) {
     // calling kotlin class function
        MyJavaClass.addition(6,7)
     }
