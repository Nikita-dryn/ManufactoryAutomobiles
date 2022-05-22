package pojo

class Automobile : Vehicle()
{
    override var name: String = "Automobile"
    override var autopilot: Boolean = false
    override fun createObject() {
        println("$name is created")
    }



}