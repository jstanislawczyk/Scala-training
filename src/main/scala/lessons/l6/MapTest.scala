package lessons.l6

class MapTest {
  def printMap(): Unit = {
    val emptyMap: Map[Char,Int] = Map()

    var colors = Map("red" -> "#F00", "azure" -> "#F0FFFF")
    val colors2 = Map("blue" -> "#00F")

    colors += ("green" -> "#0FF0")

    println("Keys:")
    println(colors.keys)

    println("Values:")
    println(colors.values)

    println("Concat:")
    println(colors ++ colors2)

    println("Iterate map:")
    colors.keys.foreach{ key =>
      println(s"Key = $key")
      println(s"Value = ${colors(key)}")
    }

    println(s"Map contains blue? ${colors.contains("blue")}")
    println(s"Map contains blue? ${colors.contains("red")}")

  }
}
