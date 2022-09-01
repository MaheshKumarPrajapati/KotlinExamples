package com.mahesh_prajapati.kotlinexamples.basic_examples

fun main(){
    val r1= 1..10   // we can also use  1.rangeTo(10)
    println("Range Contains number in increasing order")
    for (item in r1) {
      print(" $item")
    }


    val r2= 1..10 step 2
    println("\nRange Contains number in increasing order by step 2")
    for (item in r2) {
        print(" $item")
    }

    val r3= 10 downTo 1   //we can also use 10.downTo(1)
    println("\nRange Contains number in decreasing order")
    for (item in r3) {
        print(" $item")
    }

    val r4= 10 downTo 1 step 2
    println("\nRange Contains number in decreasing order by step 2")
    for (item in r4) {
        print(" $item")
    }

    val r5= 'a'..'z'
    println("\nRange Contains Alphabet char in increasing order")
    for (item in r5) {
        print(" $item")
    }

    val r6= 'a'..'z' step 2
    println("\nRange Contains Alphabet char in increasing order by step 2")
    for (item in r6) {
        print(" $item")
    }

    val r7= 'z' downTo 'a'
    println("\nRange Alphabet char in decreasing order")
    for (item in r7) {
        print(" $item")
    }

    val r8= 'z' downTo 'a' step 2
    println("\nRange Alphabet char in decreasing order by step 2")
    for (item in r8) {
        print(" $item")
    }

    val ispresent= 'c' in r8
    println("\nChecking char available in range $ispresent")

}