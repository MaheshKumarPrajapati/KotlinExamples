package com.mahesh_prajapati.kotlin_examples.scope_function

fun main() {
    // Initialise numbersList
    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)
    // Operations on the 'numbersList'
    val duplicateNumbers = numbersList.also {
        //Refer to context object by using 'it'
        println("The list elements are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list elements after removing an element: $it")
        //The return value is the 'context object'
    }
    // duplicateNumbers will be same as numbersList
    println("Original numbers: $numbersList")
    println("Duplicate numbers: $duplicateNumbers")
}