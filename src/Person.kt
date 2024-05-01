class Person(val name:String, val age:Int) {
    fun speak(){
        println("$name can speak english")
    }
}
fun main(){
    val person=Person("Joe",25)
    println("Name is ${person.name}, Age is ${person.age}")
    person.speak()
}
