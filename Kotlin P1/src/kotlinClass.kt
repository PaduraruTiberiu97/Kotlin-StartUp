fun main() {
    val user1 = User("Gabytsa", 20)

    println("user name: ${user1.name}")
    println("user age: ${user1.age}")

    val user2 = User("Tiberiu", 23)

    println("user name: ${user2.name}")
    println("user age: ${user2.age}")

    val user3=User(age=80)

    println(user3.name)
    println(user3.age)

    val user4=User("Bibilik",80)

    println(user4.name)
    println(user4.age)

    val user5=User("     ",35)
    println(user5.name)
    println(user5.age)


}

class User(name: String="No Name", var age: Int) {
    val name:String

    init {
        if(name.isBlank()){
            this.name="No Name"
        }
        else
            this.name=name.trim()
    }
}