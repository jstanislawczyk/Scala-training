package lessons.l6

class TupleTest {
  def printTuple(): Unit = {
    val someTuple1 = (1, "Test", Console)
    val someTuple2 = Tuple3(1, "Test", Console)

    val intTuple = (1, 3, 4, 77)

    intTuple.productIterator.foreach{ number => println(s"Value: $number")}

    println(s"Tuple sum: ${intTuple._1 + intTuple._2 + intTuple._3 + intTuple._4}")

    println(s"Tuple as string: ${intTuple.toString()}")
  }
}
