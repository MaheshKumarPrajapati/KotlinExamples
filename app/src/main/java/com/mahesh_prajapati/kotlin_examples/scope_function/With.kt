package com.mahesh_prajapati.kotlin_examples.scope_function

fun main(array: Array<String>){

    val person = Person()

    val bio: String = with(person) {
       // Refer to context object by using 'this'
        age=28           // or this.age =28
        println(name)    // or println(this.name)
        println(age)     // or println(this.age)
        age + 5
        "I love kotlin programming"
      // The return value is the 'lambda result'. will be returned and stored in 'bio' String variable
    }
    println(bio)
}

class Person{
 var name:String ="Mahesh"
 var age:Int = 34
}