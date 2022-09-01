package com.mahesh_prajapati.kotlin_examples.loops

fun main(array: Array<String>){
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println(" $i $j")
            if(i==2 && j==2)
            break@myLoop
        }
    }
}
