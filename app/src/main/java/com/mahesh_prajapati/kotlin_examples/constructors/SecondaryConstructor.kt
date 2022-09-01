package com.mahesh_prajapati.kotlin_examples.constructors

fun main (array: Array<String>){
    Employee("Mahesh",12345,"9876543214")
}

class Employee(val name:String,var id:Int) {
    var mobile:String="Not Initilize"
    init {
        println("Employee Details From Primary Constructor name: $name , ID: $id , Mobile: $mobile")
    }

    constructor(empName: String,empID: Int,empMobile:String):this (empName,empID){
        this.mobile=empMobile
        println("Employee Details From Secondary Constructor name: $empName , ID: $empID , Mobile: $mobile")

    }
}