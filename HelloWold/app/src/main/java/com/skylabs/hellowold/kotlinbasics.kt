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
}
