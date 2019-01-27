package lessons.l6

object Collections {
  def main(args: Array[String]): Unit = {
    val listTest = new ListTest
    val setTest = new SetTest
    val mapTest = new MapTest

    println("LIST")
    listTest.printList()

    println("\nSET")
    setTest.printSet()

    println("\nMAP")
    mapTest.printMap()
  }
}
