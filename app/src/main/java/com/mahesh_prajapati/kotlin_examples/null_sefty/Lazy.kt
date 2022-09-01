package com.mahesh_prajapati.kotlin_examples.null_sefty

val pi: Float by lazy {
    3.14f
}

fun main(args: Array<String>) {
    println("Some initial code.....")

    // pi is not initialised yet

    val area1 = pi * 4 * 4      // pi gets initialised and assigned the value of 3.14f for the first time
    val area2 = pi * 9 * 9      // The value pi is loaded from cache memory

    println("Some more code....")
}