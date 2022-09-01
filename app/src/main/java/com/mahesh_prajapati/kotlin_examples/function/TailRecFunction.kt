package com.mahesh_prajapati.kotlin_examples.function

import java.math.BigInteger

var string:String=""
fun main(array: Array<String>){
    println(getFibonacciNumber(20,BigInteger("0"),BigInteger("1")))
}

tailrec fun getFibonacciNumber(iteration:Int,param1:BigInteger,param2:BigInteger):String{
    if(iteration==0) {
     return string
    }else {
       var add=param1+param2
        string= "$string   $add"
       return getFibonacciNumber(iteration-1,param2,add)
    }
}