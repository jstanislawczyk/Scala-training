package lessons.l9

import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("test.txt")
    } catch {
      case missing: FileNotFoundException => {
        println(s"Missing file: $missing")
      }

      case io: IOException => {
        println(s"IO Exception: $io")
      }
    } finally {
      println("Finally")
    }
  }
}
