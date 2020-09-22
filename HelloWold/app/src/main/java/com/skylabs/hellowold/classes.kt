package com.skylabs.hellowold

fun main() {
    var msee = Person()
    var deno = Person("muli", "eric", 32)
    deno.firstName = "Msee"
    deno.hobby = "Scatting"
    deno.stateHobby()
    deno.age = 45
    /////////////////class car
    var mycar = Car()
    mycar.maxspped = 8
    println(mycar.maxspped)
}
////////////////////////////////Class Person

class Person(
    fname: String = " ERic",
    lname: String = "Muli"
) { //you can create default classes to be called when the class is initialized with out properties
    //member variable / properties
    var age: Int? = null
    var hobby: String = "Wacth Netflix"
    var firstName: String? = null
    //member functions / methods
    fun stateHobby() {
        println("$firstName Hobby is $hobby")
    }

    //member constructor /secondary
    constructor(fname: String, lname: String, age: Int) : this(fname, lname) {
        this.age = age
        println("Person Created $fname  and age $age")
    }

    init {
        firstName = fname
        println("Person Created $fname ")
    }
}

////////////////////////////////////Car
class Car() {
    lateinit var owner: String
    var myBrand: String = "BMW"
        get() {
            return field.toLowerCase()
        }

    var maxspped = 200
        set(value) {
            field =
                if (value > 0) value else throw IllegalArgumentException("field cant be less than 0")
        }
    var myModel: String = "MD5"
        private set

    init {
        this.owner = "Frank"
        print(owner)
    }

}