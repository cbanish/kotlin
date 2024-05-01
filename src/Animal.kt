open class Animal(val name:String) {
    open fun makeSound(){
        println("Animal make sound")
    }
}

class Dog(name:String) :Animal(name){
    override fun makeSound() {
        //super.makeSound()
        println("$name barks")
    }
}
fun main(){
    val dog=Dog("Puppy")
    dog.makeSound()
}