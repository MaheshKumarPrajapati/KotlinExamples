@file:JvmName("KotlinCustomClass")

package com.mahesh_prajapati.kotlin_examples.function.default_function

@JvmOverloads
fun volume(a: Int, b: Int, c:Int=10) {
    println("Volume is ${a*b*c}")
}

fun main(arg: Array<String>) {
    // calling kotlin class function
    volume(6,7)
}