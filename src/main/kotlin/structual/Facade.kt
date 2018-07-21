/* Model classes */
class Driver {
  fun rideInCar() = println("Ride in a car.")
  fun getOffCar() = println("Get off a car.")
}

class Key {
  fun insertKey() = println("Insert a key from car.")
  fun pullOutKey() = println("Pull out a key from car.")
}

class Engine {
  fun startEngine() = println("Turn a key and start engine.")
  fun stopEngine() = println("Turn a key and stop engine.")
}

class Pedal {
  fun stepOnAccelePedal() = println("Step on the accele pedal.")
  fun stepOnBrakePedal() = println("Step on the brake pedal.")
}

/* Facade class */
class Car(val driver: Driver, val engine: Engine, val key: Key, val pedal: Pedal) {
  fun startDrive() {
    println("===== Start drive! =====")

    driver.rideInCar()
    key.insertKey()
    engine.startEngine()
    pedal.stepOnAccelePedal()
  }

  fun finishDrive() {
    println("===== Let's finish drive! =====")
    pedal.stepOnBrakePedal()
    engine.stopEngine()
    key.pullOutKey()
    driver.getOffCar()
  }
}

fun main(args: Array<String>) {
  val car = Car(Driver(), Engine(), Key(), Pedal())
  car.startDrive()
  car.finishDrive()
}