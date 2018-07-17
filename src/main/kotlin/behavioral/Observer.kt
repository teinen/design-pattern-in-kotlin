import kotlin.properties.Delegates

/* Observer interface */
interface StatusChangeObserver {
  fun onChange(newStatus: String)
}

/* Observer class */
class PrintStatusChangeObserver : StatusChangeObserver {
  override fun onChange(newStatus: String) = println("Status is changed to \"$newStatus\"")
}

/* StatusViewer class */
class StatusViewer {
  // observer
  var observer: StatusChangeObserver? = null

  var status: String by Delegates.observable("") {
    _, _, new ->
    observer?.onChange(new)
  }
}

fun main(args: Array<String>) {
  val statusViewer = StatusViewer()
  statusViewer.observer = PrintStatusChangeObserver()

  statusViewer.status = "Not yet"
  statusViewer.status = "Done"
}