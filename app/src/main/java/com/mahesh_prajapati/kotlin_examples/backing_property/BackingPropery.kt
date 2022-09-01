package com.mahesh_prajapati.kotlin_examples.backing_property

fun main(array: Array<String>){
    Human().age=55
}
class Human{
   var age=20
    get() {
      println("age $field")
      return field
    }
    set(value) { field =value}
}