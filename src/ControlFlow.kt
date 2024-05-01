fun main(){
    val x=-10;
    if(x>0){
        println("Positive number")
    }else if(x<0){
        println("Negative number")
    }else{
        println("Zero")
    }

    when(x){
        0 -> println("Zero")
        in 1..Int.MAX_VALUE -> println("Positive")
        else -> println("Negative")
    }
    for(i in 1..5){
        println(i)
    }

    var j=10
    while(j<=15){
        println(j)
        j++
    }
}