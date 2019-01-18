package lessons.l1

object HelloWorld {
  def main(args: Array[String]) {
    println("This is my first Scala app!")

    val number = 5
    println(s"Some variable: $number")

    val typeVar: Int = 1 + 1
    println(s"Variable with type: $typeVar")

    /* Block */
    println({
      val blockTest = 1 + 1
      s"Block: ${blockTest + 1}"
    })
  }
}