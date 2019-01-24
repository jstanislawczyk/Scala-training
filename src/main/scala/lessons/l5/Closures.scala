package lessons.l5

object Closures {

  def main(args: Array[String]): Unit = {
    val multiplier = 3
    val multiply = (i: Int) => i * multiplier

    println(s"Multiply: ${multiply(4)}")
    println(s"Multiply: ${multiply(5)}")
  }
}
