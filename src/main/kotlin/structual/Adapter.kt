/* Product interface */
interface Product {
  fun getPriceWithTax(): Double
}

/* Old Product class */
class OldProduct(var price: Double)

/* New Product class */
class NewProduct(var oldProduct: OldProduct): Product {
  override fun getPriceWithTax(): Double {
    return oldProduct.price * 1.08
  }
}

fun main(args: Array<String>) {
  var oldProduct = OldProduct(1500.00)
  var newProduct = NewProduct(oldProduct)

  println("Price with no tax: ${oldProduct.price}")
  println("Price with tax: ${newProduct.getPriceWithTax()}")
}