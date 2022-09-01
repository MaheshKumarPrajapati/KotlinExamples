package com.mahesh_prajapati.kotlin_examples.inheritance

fun main(array: Array<String>){
    var cow=Cow()
    println(cow.color)
    cow.eat()

}

open class Animals {
    open var color:String ="black"
    open fun eat(){
        println("Animal Eat")
    }
}

class Cow : Animals(){
    var breed:String =""
    override var color:String = "white"
    fun drink(){
        println("drink")
    }
    override fun eat(){
        super.eat() //  super<Animals>.eat() in case of amboguity
        println("Cow Eat")
    }
}
