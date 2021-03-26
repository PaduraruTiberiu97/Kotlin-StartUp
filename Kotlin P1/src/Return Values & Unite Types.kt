fun main(){
    /*println(getMax(12,12))
    val max=getMax(3,12)
    println(max)*/
    //println(getMaxSecond(3,4))
}


//fun main()= println(getDouble(12.2))

fun getMax(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}

fun getDouble(num:Double):Double{
    return num*2
}

//same as getDouble function (single expression function)
fun getDoubleSecond(num:Double)=num*2

//single-expression-function
fun getMaxSecond(num1:Int,num2:Int)= if(num1>num2) num1 else num2
fun getMaxSecond(num1:Double,num2:Double)= if(num1>num2) num1 else num2
fun getMaxSecond(num1:Int,num2:Int,num3:Int)=
    when{
        num1>=num2 && num1>=num3 ->num1
        num2>=num1 && num2>=num3->num2
        else->num3
    }

fun greetings(name:String,reps:Int){
    for(i in 0 until reps)
        println("Hello $name")
}

fun greetings(reps:Int,name:String){
    for(i in 0 until reps)
        println("Hello $name")
}

