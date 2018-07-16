/* Console interface */
interface Console

/* Concrete Console classes */
class PlayStation4 : Console
class XboxOne : Console


/* Abstract Factory */
abstract class AbstractFactory {
  abstract fun getConsole(): Console

  companion object {
    inline fun <reified T: Console> createFactory(): AbstractFactory = when (T::class) {
      PlayStation4::class -> PlayStation4Factory()
      XboxOne::class      -> XboxOneFactory()
      else                -> throw RuntimeException()
    }
  }
}


/* Concrete Factory */
class PlayStation4Factory : AbstractFactory() {
  override fun getConsole(): Console = PlayStation4()
}

class XboxOneFactory : AbstractFactory() {
  override fun getConsole(): Console = XboxOne()
}


fun main(args: Array<String>) {
  val factory = AbstractFactory.createFactory<PlayStation4>()
  val playStation4 = factory.getConsole()
  println("Console name is $playStation4")
}