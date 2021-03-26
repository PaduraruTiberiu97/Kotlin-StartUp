fun main(){
    greetMe("Tibi",3)
    greetMe("Alex",1)
    greetMe()
    greetMe(reps=5)

    greetMe("This is a message","MyName",3)

    println("The sum is: ${getSum(d=4,a=2,b=3)}")


}

fun greetMe(name:String="User",reps:Int=1){
    for(i in 0 until reps)
        println("Hello, $name")
}
fun greetMe(message:String,name:String="User",reps:Int=1){
    for(i in 0 until reps)
        println("Hello, $name!$message")
}

fun getSum(a:Int,b:Int,c:Int=0,d:Int=0):Int{
    return a+b+c+d
}

