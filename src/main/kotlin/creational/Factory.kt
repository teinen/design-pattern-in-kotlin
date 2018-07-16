/* Vehicle interface */
interface Vehicle {
  val type: String
}


/* Vehicle classes */
class Car(override val type: String = "Car") : Vehicle
class Ship(override val type: String = "Ship") : Vehicle
class Plane(override val type: String = "Plane") : Vehicle


/* Vehicle names */
enum class VehicleName {
  Ferrari, Porsche, Titanic, Cessna
}

/* Vehicle Factory */
class VehicleFactory {
  fun vehicleType(name: VehicleName): Vehicle? {
    return when (name) {
      VehicleName.Ferrari, VehicleName.Porsche -> Car()
      VehicleName.Titanic                      -> Ship()
      VehicleName.Cessna                       -> Plane()
    }
  }
}

fun main(args: Array<String>) {
  // Create Vehicle Factory
  val factory = VehicleFactory()

  // Create each vehicles
  val ferrariType = factory.vehicleType(VehicleName.Ferrari)?.type
  println("Ferrari is $ferrariType")

  val titanicType = factory.vehicleType(VehicleName.Titanic)?.type
  println("Titanic is $titanicType")

  val cessnaType = factory.vehicleType(VehicleName.Cessna)?.type
  println("Cessna is $cessnaType")
}