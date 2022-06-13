package automobile

class Truck(
    override var autopilot: Boolean,
    override var id: Int,
    override var name: String,
    override var type: String,
    override var registrationNumber: String
) :Vehicle()
