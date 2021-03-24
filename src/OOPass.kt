fun main(){
var t=Human("Jean",17,54)
    t.eat(1)
t.speak("its a splendid day")
    t.birthday()
    var y=User("Edna","Guinevere","ednnagee@gmail.com","0742666917","graceful")
     println(y.firstname)
    println(y.lastname)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        println("I am eating $foodWeight Kgs of food")
        weight=foodWeight+weight
        return weight
    }
    fun speak(speech:String){
        println("its a splendid day")

    }
    fun birthday():Int{
       var t =age++
        return t
    }

}
data class User(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String)


