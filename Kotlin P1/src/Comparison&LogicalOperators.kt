fun main() {
   homeWork()

}
fun booleanMethos(){
    println("2>1 is ${2 > 1}")
    println(true && false)
    println(true || false)
    println(true || true)

    println(true xor true)
    println(true xor false)

    val condition = (2 > 0) || (3 > 2) && (2 > 3)

    println(condition)
}
fun doMethod(){
    var i=0
    outer@ do {
        println(i)
        i++

        var j=0
        while (j<5){
            println("---$j")
            j++
            break@outer
        }
        println("I'm printed")
    }while (i<5)

}

fun homeWork(){
    var divNr=0
    var number=100
    while(number>1){
        number /= 2
        divNr++
    }
    println(number)
    println(divNr)

}


