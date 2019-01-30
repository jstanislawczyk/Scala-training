package lessons.l10

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
}
