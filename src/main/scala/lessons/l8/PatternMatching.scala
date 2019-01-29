package lessons.l8

object PatternMatching {
  def main(args: Array[String]) {
    println(matchTest(1))
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(33))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "Int value"
    case _ => "many"
  }
}
