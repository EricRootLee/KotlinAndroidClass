package com.skylabs.hellowold

fun main(){

    var audi = Car1("A3","Audi")
    var tesla = ElecCar("Sm","Tesal",85.0)

    audi.drive(200.0)
    tesla.drive(200.0)
    tesla.extendRange(390.0)
    tesla.drive()
    audi.extendRange(120.0)

}

open class Car1 ( val name:String , val brand:String){

  open  var range:Double = 0.0
   open fun extendRange(amount:Double){
        if(amount>0)
        {
        range +=amount
        }
    }
    fun getRange(){
        println(range)
    }

    open fun drive(distance:Double){
        println("Drove for $distance Km")
    }


}
class ElecCar(name: String, brand: String , batterylife:Double) :Car1 (name,brand){

    override var range = batterylife *5.5


    override fun drive(distance: Double) {
       println("Drove $distance on Electricity")
    }

    fun  drive()
    {
        println("drove for $range on electicity")
    }
}