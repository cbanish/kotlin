fun main(){
    println("Sum is "+addition(3,7))
    printCollection()
}

fun addition(a:Int,b:Int):Int{
    return a+b
}

fun printCollection(){
    val list= listOf("Book","Pen","Pencil")
    val set= setOf("Book","Pen","Pencil","Book","Pen","Pencil")
    val map= mapOf("apple" to 2,"orange" to 5,"banana" to 3)
    println("list items are"+list)
    println("set items are"+set)
    println("map items are"+map)
}