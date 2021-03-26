import kotlin.math.roundToLong

fun main() {
    // firstFunction()
   // secondFunction()
    thirdFunction()

}

fun firstFunction() {
    //use val when you dont want to modify the variable (val it's like final)
    //use var when you want a variable to be modified later
    //we can remove the type of the variable because the jvm can detect what type of variable it is
    //val userName: String="Tiberiu"
    //var age:Int =23
    val userName = "Tiberiu"
    var age = 23

    println("Hello, world!My name is $userName.I am $age years old.In 2 years, I'll be ${age + 2}.")
}

fun secondFunction() {
    val exampleString = "\"Tiberiu\nStefan\""
    val exampleRawString=""" "Tiberiu Stefan" """
    println(exampleString)
    println(exampleRawString)
    val exampleNumber = 2_000_000.92
    val exampleLong = exampleNumber.roundToLong()
    println(exampleLong)

    var exampleChar = '?'
    var exampleBool = false
    if (exampleBool)
        print(exampleChar)
    else
        println(exampleChar.toInt())

    //Declaration
    val exampleDeclaration:Double

}

fun thirdFunction(){
    var a=5
    val b=3
    println("a="+a)
    println("a+b=${a+b}")

    a+=2
    println("a+=2-$a")

    a-=2
    println("a-=2-$a")

    a*=2
    println("a*=2-$a")

    a/=2
    println("a/=2-$a")

    a%=2
    println("a%=2-$a")

    println(a++)
    println(++a)

}
fun asd(){

}

