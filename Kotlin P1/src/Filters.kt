fun main() {
    val decorations =
        listOf("rock", "paper", "scissors", "pagoda", "plastic plant", "alligator", "flowerpot", "airport")
    println(decorations.filter { it[0] == 'p' && it[1] == 'a' })

    val eager = decorations.filter { it[0] == 'a' }
    println("eager:$eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered:$filtered")

    val newList = filtered.toList()
    println(newList + "1")

    val lazyMap = decorations.asSequence().map {
        println("access:$it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it.length==5}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}
