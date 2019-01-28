package lessons.l7

object ObjectsAndClasses {
  def main(args: Array[String]): Unit = {
    val point = new Point()
    point.x_=(5)
    point.y_=(3)

    println(point)
    point.move(4,5)

    println("Extended class")
    val point3D = new Point3D(1,2,3)

    point3D.z_=(10)
    println(point3D)

    point3D.move(1,2,3)
  }
}
