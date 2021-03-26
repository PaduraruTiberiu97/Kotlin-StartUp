fun main() {
    greet("Tiberiu", 3)
    greet2("Andreea",5)
    printMax(3,3)

}

fun greet(name: String, reps: Int) {
    for (i in 0 until reps)
        println("Hello $name, how are you?")
}

fun greet2(name: String, reps: Int) {
    //In kotlin you cannot re-assign the value of a parameter.Instead, you have to declare it
    var repsLeft=reps
    while (repsLeft > 0) {
        println("Hello $name, how are you?")
        //reps--
        repsLeft--
    }
}

fun printMax(number1:Int,number2:Int){
 /*   val max:Int
    if(number1>number2){
        max=number1
        println("Max number is $max")
    }else if(number1<number2){
        max=number2
        println("Max number is $max")
    }else if(number1==number2){
        max=number1
        println("Numbers are equal, so the number is $max")
    }*/

    val max=if(number1>number2) number1 else number2
    println("Max number is $max")


}