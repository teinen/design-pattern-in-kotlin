/* Price interface */
interface Price {
  fun getPriceWithTax(): Double
}

/* Old Price */
class OldPrice(val price: Double): Price {
  override fun getPriceWithTax() = price * 1.05
}

/* Decorator */
class NewPrice(val oldPrice: OldPrice): Price {
  /* overriding function */
  override fun getPriceWithTax() = oldPrice.price * 1.08
  /* new function */
  fun getDescountedPrice() = oldPrice.price * 0.90

}

fun main(args: Array<String>) {
  val oldPrice = OldPrice(1000.00)
  println("Old Price: ${oldPrice.getPriceWithTax()}")

  val newPrice = NewPrice(oldPrice)
  println("New Price: ${newPrice.getPriceWithTax()}")
  println("Discounted Price: ${newPrice.getDescountedPrice()}")
}