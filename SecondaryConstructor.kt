fun main(args: Array<String>) {
    // Creating an object using the primary constructor
    val person1 = Person2("Alice", 25)
    println("Primary Constructor: ${person1.firstName}, ${person1.age}")

    // Creating an object using the secondary constructor
    val person2 = Person2("Bob",22)
    println("Secondary Constructor: ${person2.firstName}, ${person2.age}")
}

class Person2(val firstName: String, val age: Int) {
    // Secondary constructor
    constructor(firstName: String) : this(firstName, 18) { // Default age is 18
        println("Secondary constructor called")
    }
}
