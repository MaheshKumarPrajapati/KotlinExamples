package com.mahesh_prajapati.kotlin_examples.abstract_class

fun main(array: Array<String>){
    val cow=Cow()
    println(cow.color)
    cow.eat()
    cow.drink()
    cow.sleep()

}

abstract class Animals {
    abstract var color:String
    abstract fun eat()
    open fun drink(){
        println("Animals drink")
    }
    fun sleep(){
        println("Animals sleep")
    }
}

class Cow : Animals(){
    override var color: String = "white"


    override fun eat() {
        println("Cow sleep")
    }

}