fun main() {
    val names = arrayOf("Jim", "Jon", "Jenny")

    names[1] = "Jeremy"

    println("First element: ${names[0]}")
    println("Second element: ${names[1]}")
    println("Size of array: ${names.size}")
    println("Third letter of the second element is ${names[1][2]}")

    val arats= arrayOf(arrayOf(3,2,1), arrayOf(1,2,3))
    println("Array in array: ${arats[0][1]}")

    //To make an array of a specific primitive type we need to use specific methods
    val intArray= intArrayOf(1,2,3)
    val doubleArray= doubleArrayOf(1.1,2.2,3.3)

    val myIntArray=IntArray(9)
    for(number in myIntArray)
        println(number)

}

