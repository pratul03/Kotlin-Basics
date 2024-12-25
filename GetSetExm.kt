fun main(args: Array<String>){
    val cherry = Girl()
    cherry.actualAge = 16
    cherry.age = 16
    println("Cherry's actual age : ${cherry.actualAge}")
    println("Cherry's pretended age : ${cherry.age}")

    val sibu = Girl()
    sibu.actualAge = 20
    sibu.age = 20
    println("Sibu's actual age : ${sibu.actualAge}")
    println("Sibu's pretended age : ${sibu.age}")

    val buriSibu = Girl()
    buriSibu.actualAge = 36
    buriSibu.age = 36
    println("Buri Sibu's actual age : ${buriSibu.actualAge}")
    println("Buri Sibu's pretended age : ${buriSibu.age}")
}

class Girl{
    var age : Int = 0
    get() = field
    set(value){
        field = if ( value < 18)
            18
        else if( value > 18 && value <= 30)
            value
        else
            value-3
    }
    var actualAge: Int = 0
}