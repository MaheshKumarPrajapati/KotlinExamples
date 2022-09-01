package com.mahesh_prajapati.kotlin_examples.null_sefty

fun main(args: Array<String>) {
    val country = Country()
//    country.name = "India"
//    println(country.name)
    country.setup()
}

class Country {
    lateinit var name: String
    fun setup() {
        name = "USA"
        println("The name of country is $name")
    }
}