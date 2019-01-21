package lessons.l3

object Loops {
  def main(args: Array[String]): Unit = {

    /* var - can change value */
    /* val - immutable */

    // for loop execution with a range
    println("range")
    for( loopIteration <- 2 to 6) {
      println(s"value of loopIteration: $loopIteration")
    }

    // for loop execution with an until and second iteration
    println("\nuntil")
    for( loopIteration <- 2 until 4; secondLoopIteration <- 1 to 2) {
      println( s"value of loopIteration: $loopIteration")
      println( s"value of secondLoopIteration: $secondLoopIteration")
    }

    //filters
    println("\nfilters")
    for( loopIteration <- 1 to 5
         if loopIteration != 3; if loopIteration != 4 ) {
      println( s"value of loopIteration: $loopIteration")
    }

    //yield and foreach
    println("\nyield")
    val textArray = Array("Zara", "Test", "Lol")
    val result = for (text <- textArray) yield text.toUpperCase
    result.foreach { println }

    //while
    println("\nwhile")
    var loopIteration = 0
    while( loopIteration < 5 ) {
      println( s"value of loopIteration: $loopIteration")
      loopIteration += 1
    }

    //do-while
    println("\ndo-while")
    loopIteration = 0
    do {
      loopIteration += 1
      println( s"value of loopIteration: $loopIteration")
    } while ( loopIteration < 5 )
  }
}
