fun main() {
    p3()
}

fun p1() {
    for (i in 1..10) {
        if (i !in 4..7)
            continue
        println(2.2 in 1.1..3.3)
        println(i)
    }
}

fun p2() {
    for (i in 1..10) {
        val prefix1 = if (i !in 4..7) "-" else "<"
        val prefix2 = if (i == 1) {
            "*"
        } else if (i !in 4..7) {
            "-"
        } else {
            print("-")
            ">"
        }
        println("$prefix2 $i")
    }
}

fun p3() {
    val time = -12
    when (time) {
        in 0..11 -> println("Good morning")
        12 -> println("Timefor lunch")
        else -> println("Good day")
    }

    val time2 = 140
    val greeting = when (time2) {
        in 0..5 -> "Why up so early"
        in 0..11 -> "Good morning"
        12 -> "Time for lunch"
        13, 14 -> {

            println("Yawn...")
            "Time for a nap"
        }
        else -> "??????"
    }
    println(greeting)

    val time3 = 140
    val greeting2 = when {
        time3 < 5 -> "Why up so early"
        time3 in 0..11 -> "Good morning"
        time3 == 12 -> "Time for lunch"
        time3 == 13 || time3 == 14 -> {

            println("Yawn...")
            "Time for a nap"
        }
        else -> "??????"
    }
    println(greeting2)
}