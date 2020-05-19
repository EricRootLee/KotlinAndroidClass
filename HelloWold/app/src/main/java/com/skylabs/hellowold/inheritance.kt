package com.skylabs.hellowold

fun main(){

    var audi = Car1(23.2,"A3", "Audi")
    var tesla = ElecCar(78.0,"Sm","Tesal",85.0)

    audi.drive(200.0)
    tesla.drive(200.0)
    tesla.extendRange(390.0)
    tesla.drive()
    audi.extendRange(120.0)
    audi.brake()
    tesla.brake()

}

open class Car1 (override val maxspeed:Double, val name:String , val brand:String) : Drivable{
    override fun drive(): String {

        return "Driving intefcae car"
    }

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
class ElecCar( maxspeed: Double,name: String, brand: String , batterylife:Double) :Car1 (maxspeed,name,brand){

    override var range = batterylife *5.5


    override fun drive(distance: Double) {
       println("Drove $distance on Electricity")
    }

    override fun brake() {
        //super.brake()
        println("Electric braking")
    }

    override fun  drive() :String
    {
        return "drove for $range on electicity"
    }

    //    override fun brake() {
//        super.brake()
//    }
}