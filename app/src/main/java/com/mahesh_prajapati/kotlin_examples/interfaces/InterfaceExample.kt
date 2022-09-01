package com.mahesh_prajapati.kotlin_examples.interfaces


fun main(array: Array<String>){
    val button=MyButton()
    println(button.name)
    button.onClick()
    button.onTouch()
}

interface FirstListener {
    var name:String
    fun onTouch(){
        println("FirstListener onTouch")
    }
    fun onClick(){
        println("FirstListener onClick")
    }
}

interface SecondListener {
    fun onTouch()
    fun onClick(){
        println("SecondListener onClick")
    }
}

class MyButton : FirstListener,SecondListener{
    override var name: String ="MyButton Class"

    override fun onTouch() {
        //super.onTouch()
        println("MyButton onTouch")
    }

    override fun onClick() {
        super<FirstListener>.onClick()
        super<SecondListener>.onClick()
        println("MyButton onClick")
    }
}