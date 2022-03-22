fun main(){
var lona = humans("rael",25,56)
    lona.eat(2)
    println(lona.weight)
    lona.weight
    lona.speak("Is this all that am feeling?")
    lona.birthday(7)
   var grace =humans.User("Janet","kagame","jk@yahoo","0720693456",'K')
    println(grace.email)
    println(grace.phoneNumber)
}
class humans(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        var foodWeight = 2
        weight+=foodWeight
    println("I am eating $foodWeight kgs of food")


    }

fun speak(speech:String){
println(speech)

}
    fun birthday(yearr:Int){
         age+=yearr
        println(age)

    }


data class User(var firstname:String,var lastName:String,var email:String,var phoneNumber:String,var password:Char)




}