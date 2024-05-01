interface Shape{
    fun area():Double
}

class Circle(val radius:Double): Shape {
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
fun main(){
    val circle=Circle(3.5)
    println("Area of circle is ${circle.area()}")
}