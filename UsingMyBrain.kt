fun main(){
    var person = Person("Pratul", 22)
    person.canVote(18)
}

class Person(var name: String, var age: Int){
    fun canVote(age:Int){
        if (age < 18){
            println("$age years old people can't vote.")
        }else{
            println("Your eligible to vote, you r $age years old.")
        }
    }
}
