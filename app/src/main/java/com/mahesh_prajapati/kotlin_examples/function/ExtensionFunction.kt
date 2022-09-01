package com.mahesh_prajapati.kotlin_examples.function

fun main(array: Array<String>){
   val str1 = "This is"
   val str2 = "Extension Function"
   val str3 = "Hello"

   println(str3.mergeString(str1,str2))

   val x=7
   val y=9

   println("Greater Number is: ${x.greaterNumber(y)}")
}

fun String.mergeString(str1:String,str2:String):String{
     return "$this $str1 $str2"
}

fun Int.greaterNumber(other:Int) :Int = if (this>other){this}else{ other}
