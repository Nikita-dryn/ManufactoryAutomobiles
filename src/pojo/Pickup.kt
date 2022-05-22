package pojo

class Pickup :Vehicle()
{

    override var name: String = "Pickup"
    override var autopilot: Boolean = false

    override fun createObject() {
        println("$name is created")
    }

}