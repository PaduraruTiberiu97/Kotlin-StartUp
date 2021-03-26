fun main(){
    println(getSum(arrayOf(1,2,3,4,5,6,7,8,9)))

    //vararg fun
    println(getSum(1,2,3,4,5,6,7,8,9,10,myString = "asd"))

    //calls the vararg function
    val array= intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println(getSum(20,*array,25,myString = "asd"))
}
fun getSum(numbers:Array<Int>):Int{
    var sum=0
    for(element in numbers)
        sum += element
    return sum
}
//a function can get only 1 vararg parameter (it can take 1 vararg type and other types tho)
//vararg should be the last parameter of the function so the fuction knows what parameters to take
fun getSum(vararg numbers:Int,myString:String):Int{
    var sum=0
    for(element in numbers)
        sum+=element
    return sum
}