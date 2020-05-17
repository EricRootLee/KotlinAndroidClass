package com.skylabs.hellowold

fun main(){
    var msee = Person()
    var deno = Person("muli", "eric" , 32)
    deno.firstName = "Msee"
    deno.hobby = "Scatting"
    deno.stateHobby()
    deno.age = 45
}
////////////////////////////////Class Person
class  Person (fname:String =" ERic" ,lname:String = "Muli"){ //you can create default classes to be called when the class is initialized with out properties
    //member variable / properties
    var age :Int? = null
    var hobby:String ="Wacth Netflix"
    var firstName :String? = null
    //member functions / methods
    fun  stateHobby(){
        println("$firstName Hobby is $hobby")
    }
    //member constructor /secondary
    constructor(fname: String,lname: String,age:Int):this(fname,lname){
        this.age = age
        println("Person Created $fname  and age $age")
    }
    init {
        firstName = fname
        println("Person Created $fname ")
    }


}