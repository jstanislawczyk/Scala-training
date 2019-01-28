package lessons.l7

class Point(xCoordinate: Int, yCoordinate: Int) {
  protected var _x: Int = xCoordinate
  protected var _y: Int = yCoordinate

  def x: Int = _x
  def y: Int = _y

  def move(xCoordinate: Int, yCoordinate: Int) {
    _x += xCoordinate
    _y += yCoordinate
    println (s"Point x location: ${_x}\nPoint y location: ${_y}")
  }

  def x_=(x: Int) {
    _x = x
  }

  def y_=(y: Int) {
    _y = y
  }

  def this() {
    this(0, 0)
  }

  override def toString: String = s"[x = ${_x}, y = ${_y}]"
}
