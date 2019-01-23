package lessons.l4

object Arrays {
  def main(args: Array[String]): Unit = {
    val testEmptyArray: Array[String] = new Array[String](3)
    testEmptyArray(0) = "Not empty"

    println(s"Test first array: ${testEmptyArray(0)} \n")

    val testArray: Array[String] = Array("test1", "test2")

    for(arg <- testArray) {
      println(s"Test second array: $arg")
    }

    val myMatrix = Array.ofDim[String](3,3)
    myMatrix(0)(1) = "multi dimensional"

    println(s"\nTest multi dimensional: ${myMatrix(0)(1)}")
  }
}
