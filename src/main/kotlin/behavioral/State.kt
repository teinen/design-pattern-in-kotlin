/* State */
sealed class Weather {
  /* Weather states */
  object Sunny: Weather()
  object Cloudy: Weather()
  object Rainy: Weather()
  object Snowy: Weather()
}

/* Person */
class Person {
  fun selectWear(weather: Weather) {
    when(weather) {
      Weather.Sunny -> println("Short shirt and pants.")
      Weather.Cloudy -> println("Long shirt and pants.")
      Weather.Rainy -> println("Rain coat and bring umbrella.")
      Weather.Snowy -> println("Winter coat and glove.")
    }
  }
}

fun main(args: Array<String>) {
  val person = Person()
  person.selectWear(Weather.Sunny)
  person.selectWear(Weather.Cloudy)
  person.selectWear(Weather.Rainy)
  person.selectWear(Weather.Snowy)
}