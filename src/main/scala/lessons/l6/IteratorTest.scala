package lessons.l6

class IteratorTest {
  def printIterator(): Unit = {
    val iterator1 = Iterator(1, 2, 3, 4, 6, 40, 44, 20)
    val iterator2 = Iterator(1, 2, 3, 4, 6, 40, 44, 20)
    val iterator3 = Iterator(1, 2, 3, 4, 6, 40, 44, 20)

    println(s"Size: ${iterator1.size}")
    println(s"Max: ${iterator2.max}")

    println("Print values")
    while(iterator3.hasNext) {
      print(s"[${iterator3.next()}] ")
    }
  }
}
