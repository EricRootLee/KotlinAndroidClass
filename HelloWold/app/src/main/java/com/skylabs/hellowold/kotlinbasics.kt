package com.skylabs.hellowold

fun main(){
var seasons = 20
    when (seasons){
       in  1..4 -> println("First Quater")
       in  5..8 -> println("2nd Quater")
            1,2 -> println("First 2 months")
           else -> println("Invalid response")
    }
    for (num in 1..10){
     println(num)
    }
    for (num in 1 until 10){
        print(num)
    }
    for (num in 10 downTo  1 step 2){
        print(num)
    }
    ///Nullables
    var name : String = "Dennis"
    var namenull:String? = "Muli "
    namenull?.let {
        println("am not null")
    }
    //elvis operator
    val guestname = namenull ?: "Guest" //if the namenull is null its gona assign the guest name
    print(guestname)
    namenull!!.toLowerCase() //this converts a null type to a non null type ..throws a exception when the value is null
}
