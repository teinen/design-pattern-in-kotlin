/* Vehicle interface */
interface Vehicle {
  fun getDesc()
}

/* Vehicle classes */
class Car : Vehicle {
  override fun getDesc() {
    println("This is Car!")
  }
}

class Ship : Vehicle {
  override fun getDesc() {
    println("This is Ship!")
  }
}

class Plane : Vehicle {
  override fun getDesc() {
    println("This is Plane!")
  }
}

/* Vehicle Factory */
class VehicleFactory {
  fun getVehicle(type: String?): Vehicle? {
    if (type === "CAR") {
      return Car()
    }
    else if (type === "SHIP") {
      return Ship()
    }
    else if (type === "PLANE") {
      return Plane()
    }

    return null
  }
}

fun main(args: Array<String>) {
  // Create Vehicle Factory
  val factory = VehicleFactory()

  // Create each vehicles
  val car = factory.getVehicle("CAR")
  car?.getDesc()

  val ship = factory.getVehicle("SHIP")
  ship?.getDesc()

  val plane = factory.getVehicle("PLANE")
  plane?.getDesc()
}