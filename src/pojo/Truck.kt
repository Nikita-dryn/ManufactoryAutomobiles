package pojo

class Truck :Vehicle()
{
    override var name: String = "Truck"
    override var autopilot: Boolean = false

    override fun createObject() {
        println("$name is created")
    }


}