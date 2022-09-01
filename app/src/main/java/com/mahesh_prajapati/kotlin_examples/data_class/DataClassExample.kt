package com.mahesh_prajapati.kotlin_examples.data_class

fun main(array: Array<String>){
   var user1= User("Mahesh","123")
   var user2= User("Mahesh","123")

    println(user1)
   if(user1==user2) {
       println("equals")
   }else {
       println("not equals")
   }
   var newUser=user1.copy(id="32323")
    println(newUser)
}

data class User(val name:String,val id:String)