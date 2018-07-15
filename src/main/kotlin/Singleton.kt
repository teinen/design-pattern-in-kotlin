/* Singleton object */
object Singleton {
  init {
    println("Initialized object: $this")
  }

  fun sayHello() {
    println("Hello, $this")
  }
}

fun main(args: Array<String>) {
  // Both are same object
  Singleton.sayHello()
  Singleton.sayHello()
}