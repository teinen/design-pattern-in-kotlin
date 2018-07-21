/* Formatter */
class Formatter(val strategy: (String) -> String) {
  fun print(str: String) = println(strategy(str))
}

/* Format strategy */
val upperCaseStrategy = { str: String -> str.toUpperCase() }
val lowerCaseStrategy = { str: String -> str.toLowerCase() }

fun main(args: Array<String>) {
  val upperCaseFormatter = Formatter(upperCaseStrategy)
  upperCaseFormatter.print("UpperCase")

  val lowerCaseFormatter = Formatter(lowerCaseStrategy)
  lowerCaseFormatter.print("LowerCase")
}