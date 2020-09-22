package com.skylabs.hellowold

fun main() {

    var man = Human(123.0, "DEno", "Kenya", 45.0)
    man.run()
    man.displayDetails()
    var anim = Elephant(899.0,"JIigi",897.0,"Ausis")
    anim.displayDetails()
}

abstract class Mammal(
    private val name: String,
    private val origin: String,
    private val weight: Double
) {
    abstract var maxspeed: Double
    abstract fun run()
    abstract fun breath()
    fun displayDetails() {
        println("Name: $name , Origin: $origin , Weight: $weight , MaxSpeed : $maxspeed")
    }
}

class Human(override var maxspeed: Double, name: String, origin: String, weight: Double) :
    Mammal(name, origin, weight) {

    override fun run() {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Runs")
    }

    override fun breath() {
        println("Breath")
    }
}

class Elephant(override var maxspeed: Double, name: String, weight: Double, origin: String) :
    Mammal(name, origin, weight) {

    override fun breath() {
        println("E breaths")
    }

    override fun run() {
        println("E runs")
    }
}
