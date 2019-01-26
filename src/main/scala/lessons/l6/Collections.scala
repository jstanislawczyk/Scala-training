package lessons.l6

object Collections {
  def main(args: Array[String]): Unit = {
    val listTest = new ListTest()
    val setTest = new SetTest()
    println("LIST")
    listTest.printList()
    println("\nSET")
    setTest.printSet()
  }
}
