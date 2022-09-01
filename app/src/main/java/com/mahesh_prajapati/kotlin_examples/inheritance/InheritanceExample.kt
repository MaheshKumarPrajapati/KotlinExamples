package com.mahesh_prajapati.kotlin_examples.inheritance

fun main(array: Array<String>){
    var dog=Dog()
    dog.color="Black"
    dog.breed="Normal"
    dog.eat()
    dog.bark()

    var cat=Cat()
    cat.color="White"
    cat.age=2
    cat.eat()
    cat.meow()

    var animal=Animal()
    cat.color="Brown"
    cat.eat()

}

open class Animal {
 var color:String =""
 fun eat(){
  println(color)
  println("Eat")
 }
}

class Dog : Animal(){
  var breed:String =""
  fun bark(){
      println(breed)
      println("Bark")
  }
}

class Cat : Animal(){
   var age:Int=0
   fun meow(){
       println(age)
       println("Meow")
   }
}