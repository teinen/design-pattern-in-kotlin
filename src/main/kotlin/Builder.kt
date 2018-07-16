/* Person class */
class Person(var name: String?, var age: Int, var sex: String?) {
  // private constructor
  private constructor(builder: Builder) : this(
    builder.name,
    builder.age,
    builder.sex
  )

  /* Builder class */
  class Builder {
    // Properties
    var name: String? = null
      private set
    var age: Int = 0
      private set
    var sex: String? = null
      private set

    // Set methods
    fun name(name: String) = apply { this.name = name }
    fun age(age: Int) = apply { this.age = age }
    fun sex(sex: String) = apply { this.sex = sex }

    // Build
    fun build() = Person(this)
  }
}

fun main(args: Array<String>) {
  var person = Person.Builder().name("Alice").age(15).sex("Female").build()

  var name = person.name
  var age = person.age
  var sex = person.sex
  println("name: $name, age: $age, sex: $sex")
}