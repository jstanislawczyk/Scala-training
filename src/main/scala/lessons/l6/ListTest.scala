package lessons.l6

class ListTest {
  def printList(): Unit = {
    val empty1: List[Nothing] = List()
    val empty2: List[String] = Nil

    val fruit: List[String] = List("apples", "oranges", "pears")

    val numbers: List[Int] = List(1, 2, 3, 4)

    // Two dimensional list
    val twoDimensional: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    fruit.foreach(println)
  }
}
