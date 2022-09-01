package com.mahesh_prajapati.kotlin_examples.function


fun main(array: Array<String>){
    val x=7
    val y=9

    println("Greater Number is: ${x greaterNum y}")
}

infix fun Int.greaterNum(other:Int) :Int = if (this>other){this}else{ other}