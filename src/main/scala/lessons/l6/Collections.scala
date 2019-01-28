package lessons.l6

object Collections {
  def main(args: Array[String]): Unit = {
    val listTest = new ListTest
    val setTest = new SetTest
    val mapTest = new MapTest
    val tupleTest = new TupleTest
    val optionsTest = new OptionsTest
    val iteratorTest = new IteratorTest

    println("LIST")
    listTest.printList()

    println("\nSET")
    setTest.printSet()

    println("\nMAP")
    mapTest.printMap()

    println("\nTUPLE")
    tupleTest.printTuple()

    println("\nOPTIONS")
    optionsTest.printOptions()

    println("\nITERATOR")
    iteratorTest.printIterator()
  }
}
