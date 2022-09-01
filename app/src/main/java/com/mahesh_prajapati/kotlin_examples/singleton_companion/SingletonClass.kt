package com.mahesh_prajapati.kotlin_examples.singleton_companion

fun main(array: Array<String>){
    println(SingletonClass.color)
    SingletonClass.wakeup()
    SingletonClass.sleep()

}

open class MySuperClass {
   open fun sleep(){
        println("MySuperClass sleep")
    }
}

object SingletonClass : MySuperClass(){

    var color: String = "white"  // Behave like static variable
    fun wakeup() {
        println("SingletonClass wakeup") // Behave like static function
    }
    override fun sleep(){
      super.sleep()
        println("SingletonClass sleep")
    }
}