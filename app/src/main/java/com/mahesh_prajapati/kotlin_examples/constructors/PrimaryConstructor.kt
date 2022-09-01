package com.mahesh_prajapati.kotlin_examples.constructors

fun main(array: Array<String>){
 val student=Student("Mahesh",25)
}
class Student(val name:String,var age:Int) {
    init {
        age=23
        println("Student name is $name and age is $age")
    }
}