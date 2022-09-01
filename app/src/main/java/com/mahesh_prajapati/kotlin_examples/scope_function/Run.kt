package com.mahesh_prajapati.kotlin_examples.scope_function

fun main() {
    val person: Person? = Person()

    val bio = person?.run {
       // Refer to context object by using 'this'
        println(name)
        println(age)
        age + 5
        "I Love kotlin Programming"
      // The return value is the 'lambda result'. will be returned and stored in 'bio' variable
    }

    println(bio)
}