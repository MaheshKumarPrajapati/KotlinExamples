package com.mahesh_prajapati.kotlin_examples.scope_function

fun main() {
    val student = Student().apply {  //Refer to context object by using 'this'
        name = "Mahesh"   //or this.name = "Mahesh"
        rollNo = 26       //or this.rollNo=26
       // The return value is the 'context object'
    }

    with(student) {
        println(name)
        println(rollNo)
    }

}

class Student{
    lateinit var name:String
    var rollNo:Int=0
}