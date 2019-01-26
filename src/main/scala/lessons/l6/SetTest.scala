package lessons.l6

class SetTest {
  def printSet(): Unit = {
    val emptySet: Set[Int] = Set()

    val intSet: Set[Int] = Set(1, 3, 5, 7)

    val secondIntSet = Set(1, 2, 4, 7)

    println("Items in set 1")
    intSet.foreach(println)


    println("Items in set 2")
    secondIntSet.foreach(println)

    println(s"Common items : ${intSet.&(secondIntSet)}")
    //println(s"Common items : ${intSet.intersect(secondIntSet)}")

    println(s"Different items : ${intSet.&~(secondIntSet)}")

    println(s"Concat sets : ${intSet.++(secondIntSet)}")


    println(s"Max value in both sets : ${intSet.++(secondIntSet).max}")
  }
}
