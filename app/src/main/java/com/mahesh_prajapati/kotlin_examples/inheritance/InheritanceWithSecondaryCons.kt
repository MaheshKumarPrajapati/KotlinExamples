package com.mahesh_prajapati.kotlin_examples.inheritance

fun main(array: Array<String>){
    Branch("SBI","Noida")
}

open class Banks() {
    var name:String=""
    constructor(name:String):this(){
        this.name=name
        println("Banks class constructor bank name $name")
    }
}

class Branch : Banks {
    var _name:String=""
    var _place:String=""
     constructor(name:String,place:String):super(name){
         this._name=name
         this._place=place
        println("Branch class constructor bank name $name, place $place")
    }
}