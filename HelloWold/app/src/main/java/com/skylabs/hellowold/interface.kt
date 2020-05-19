package com.skylabs.hellowold

interface Drivable {

    val maxspeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }


}