fun main(){
    var us1=User(20, "Petr", "nemo", "111")
    var us2=User(20, "Petr", "asscord", "333")
    var us3=us1.copy()

    println(us1.toString())
    println(us1.login)
    println(us3.login)
}

data class User(val age:Int, val name:String){
    var login:String="qqq"
    var password:String="www"
    constructor( age:Int, name:String, login: String, password:String):this(age,name)
}
