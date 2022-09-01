package com.mahesh_prajapati.kotlin_examples.inheritance

fun main(array: Array<String>){
    var tata=Tata("Tata Neno","White")

}

open class Cars(val color:String) {
    init{
        println("Cars class init car color $color")
    }
}

class Tata(val model:String,val colors:String) : Cars(colors){
      init{
        println("Tata class init car model $model, color $colors")
      }
}
