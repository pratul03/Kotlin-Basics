class KotClass{
    private var isOn: Boolean = false;

    fun turnOn(){
        isOn = true;
    }
    fun turnOff(){
        isOn = false;
    }
    fun displayLightStatus(param: String){
        if( isOn == true){
            println("$param lamp is on.")
        }else{
            println("$param lamp is off.")
        }
    }
}

fun main(args: Array<String>){
    val l1 = KotClass()
    l1.turnOn()
    l1.displayLightStatus("l1")
    l1.turnOff()
    l1.displayLightStatus("l1")
}