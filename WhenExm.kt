fun main(args: Array<String>) {
    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    when {
        age == null -> println("Invalid input! Please enter a valid number.")
        age < 0 -> println("Age must be a positive number. you r $age years old")
        age >= 18 -> println("Eligible to vote. you r $age years old")
        else -> println("you r $age years old and not eligible to vote")
    }
}
