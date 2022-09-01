package com.mahesh_prajapati.kotlin_examples.function

fun volume(width: Int=11, length: Int=25, height:Int=10) {
    println("Volume is ${width*length*height}")
}

fun main(arg: Array<String>) {
    volume( height = 7,width = 6)
}