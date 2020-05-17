package com.skylabs.hellowold

fun main(){
    var msee = Person()
var deno = Person("muli", "eric")
}

class  Person (fname:String =" ERic" ,lname:String = "Muli"){ //you can create default classes to be called when the class is initialized with out attributes
    init {
        println("Person Created $fname")
    }

}