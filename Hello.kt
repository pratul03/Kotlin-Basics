import kotlin.reflect.typeOf

fun main(){
    println("Hello World");
    test()
}
fun test(){
    val name = "pratul";
    var name1 = "pratul";
    name1 = "pratul makar";
    println(name::class.simpleName)
    println("$name $name1")
}