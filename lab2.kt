fun main(){
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val map1 = TreeMap<Person33,Int>()
    var example=try{
        map1.put(Person33(), 33)
    }catch(e:NullPointerException){
        println("error")
        21
    }
    catch (r:Exception){
        33
    }
    println(example)
}
class Person33{
    var name:String=""
    var weight:Int=0
}
