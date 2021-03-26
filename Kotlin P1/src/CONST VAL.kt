var topLevelVariable="Im a top level variable" //it must be initialized right away
val TOP_LEVEL_VARIABLE="TOP TOP"
const val STRING_CONSTANT="I am a constant" // compile time constant means that this value vant change at all
fun main(){
    println(topLevelVariable)
    println(STRING_CONSTANT)
    topLevelVariable="ASD"
    val myArray= intArrayOf(1,2,3,4,5)
    println(getMaxx(7, *myArray))
    println(getMaxx(23,1,2,3,4,5,44,66,55))
    println(getMaxx(remaining = *intArrayOf(1,2,3,4,56),first = 111))
}

fun getMaxx(first:Int,vararg remaining:Int):Int{
    var max:Int=first

    for(i in remaining){
        if(i>max)
            max=i
    }

    return max
}