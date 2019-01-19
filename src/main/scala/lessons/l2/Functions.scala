package lessons.l2

object Functions {
  def main(args: Array[String]): Unit = {
    printMe()
    printMeWithParams("test", 10)

    val test = returnSomeValue()
    printf(s"$test")
  }

  def printMe(): Unit = {
    println("Hello, function!")
  }

  def printMeWithParams(someString: String, someInt: Int): Unit = {
    println(s"First param: $someString, second param: $someInt")
  }

  def returnSomeValue(): Int = {
    val someInt = 5
    someInt
  }
}