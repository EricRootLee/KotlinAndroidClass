package com.skylabs.hellowold

fun main(){
var seasons = 20
    when (seasons){
       in  1..4 -> println("First Quater")
       in  5..8 -> println("2nd Quater")
            1,2 -> println("First 2 months")
           else -> println("Invalid response")
    }
}