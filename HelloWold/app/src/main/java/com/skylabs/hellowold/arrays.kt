package com.skylabs.hellowold

fun main(){

////empty array
    val arr = ArrayList<String>()
    arr.add("Ine")
    arr.add("dfhsakj0")
    println("araaaaaat")
    for (i in arr){
        println(i)
    }
    arr.get(1) //gets  a specific index

    ///arrays using collections

    ///lambda expressions
val sum = {
    a:Int,
        b:Int
         -> a+b
}
print(sum(23,23))

    //visibility modifiers


}