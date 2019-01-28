package lessons.l6

class OptionsTest {
  def printOptions(): Unit = {
    val colors = Map("red" -> "#f00", "green" -> "#0f0")

    println(s"Existing color: ${colors.get("red")}")
    println(s"Missing color: ${colors.get("pink")}\n")

    println(s"Show color green: ${showExistingColor(colors.get("green"))}")
    println(s"Show color violet: ${showExistingColor(colors.get("violet"))}\n")

    val a:Option[Int] = Some(10)
    val b:Option[Int] = None

    println(s"Get value: ${a.getOrElse(0)}")
    println(s"Get else: ${b.getOrElse(20)}")

    println(s"Is a empty?: ${a.isEmpty}")
    println(s"Is b empty?: ${b.isEmpty}")
  }

  def showExistingColor(color: Option[String]): String = color match {
    case Some(element) => element
    case None => "?"
  }
}
