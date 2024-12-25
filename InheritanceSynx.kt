// Parent class
open class Animal {
    open var name: String = "Unknown"

    open fun makeSound() {
        println("Animal makes a sound")
    }
}

// Child class inheriting from Animal
class Dog : Animal() {
    override var name: String = "Dog" // Override property

    override fun makeSound() {
        println("Woof! Woof!") // Override method
    }

    fun wagTail() {
        println("$name is wagging its tail!")
    }
}

// Another child class inheriting from Animal
class Cat : Animal() {
    override var name: String = "Cat"

    override fun makeSound() {
        println("Meow! Meow!") // Override method
    }

    fun scratch() {
        println("$name is scratching!")
    }
}

fun main() {
    val dog = Dog()
    println("Animal: ${dog.name}")
    dog.makeSound()
    dog.wagTail()

    val cat = Cat()
    println("Animal: ${cat.name}")
    cat.makeSound()
    cat.scratch()
}
