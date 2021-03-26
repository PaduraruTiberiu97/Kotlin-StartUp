fun main() {
    val names = arrayOf("Tibi", "Ribi", "Bibi")
    for (name in names)
        println(name)

    for (i in 1..10)
        print("$i ")
    print("\n")

    for (i in 1 until 10)
        print("$i ")
    print("\n")

    for (i in 10 downTo 1)
        print("$i ")
    print("\n")

    for (i in 10 downTo 1 step 2)
        print("$i ")
    print("\n")

    for (i in 1..10 step 2)
        print("$i ")
    print("\n")

    for (i in 1.rangeTo(20).step(2))
        print("$i ")
    print("\n")

    for (i in 0..names.size - 1)
        if (names[i].equals("Bibi")) {
            println("Match at index $i")
        }

    for(i in 0 until names.size) {
        println(names[i])
        if (names[i].equals("Bibi")) {
            println("Match at index $i")
        }
    }
    for( i in 'A'..'z')
        print("$i ")
    println("\n")

    for(index in names.indices){
        println("Index $index Element:${names[index]}")
    }

    println(names.indices)

}