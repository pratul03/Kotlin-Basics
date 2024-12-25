fun main(args: Array<String>) {
    val person = Person1("pratul", 22)
}

class Person1(fname: String, fage: Int) {
    var firstName: String
    var age: Int

    init {
        firstName = fname.replaceFirstChar { it.uppercase() }
        age = fage
        println("First name = $firstName")
        println("Age = $age")
    }
}
