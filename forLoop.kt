fun main(args: Array<String>) {
    print("Enter the start number (n): ")
    val n = readLine()?.toIntOrNull()

    print("Enter the end number (m): ")
    val m = readLine()?.toIntOrNull()

    if (n == null || m == null) {
        println("Invalid input! Please enter valid numbers.")
        return
    }

    if (n > m) {
        println("The start number (n) must be less than or equal to the end number (m).")
        return
    }

    var sum = 0
    for (i in n..m) {
        sum += i
    }

    println("Sum of numbers from $n to $m: $sum")
    sum = 0
    for(i in m downTo 1){
        sum+= i
    }
    println("Sum of m numbers: $sum")

}
