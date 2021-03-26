import kotlin.random.Random

fun main() {
    feedTheFish()
    //swim("Slow")

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")
    println("Change water:${shouldChangeWater(day)}")
}

fun randomDay(): String {
    val week = arrayListOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[java.util.Random().nextInt(week.size)]
}

fun randomFood(): String {
    val foodList = arrayListOf<String>("Food fish 1", "Food fish 2", "Food fish 3")
    return foodList[java.util.Random().nextInt(foodList.size)]
}

fun fishFood(day: String): String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
    //OR
    /*return when(day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}*/
}

fun swim(speed:String="fast"){
    println("Swimming $speed")
}

fun shouldChangeWater(day:String,temperature:Int=22,dirty:Int=20):Boolean{
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}
