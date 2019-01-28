package lessons.l7

class Point3D(xCoordinate: Int, yCoordinate: Int, zCoordinate: Int) extends Point(xCoordinate: Int, yCoordinate: Int) {

  private var _z: Int = yCoordinate

  def z: Int = _z

  def move(xCoordinate: Int, yCoordinate: Int, zCoordinate: Int) {
    x_=(xCoordinate+_x)
    y_=(yCoordinate+_y)
    z_=(zCoordinate+_z)
    println (s"Point x location: ${_x}\nPoint y location: ${_y}\nPoint z location: ${_z}")
  }

  def z_=(z: Int) {
    _z = z
  }

  def this() {
    this(0,0,0)
  }

  override def toString: String = s"[x = ${_x}, y = ${_y}, z = ${_z}]"
}
