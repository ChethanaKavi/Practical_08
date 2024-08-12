object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    // Prompt user for input
    println("Please enter an integer:")
    val input = scala.io.StdIn.readLine().toInt

    // Define lambda functions for different cases
    val multipleOfThree: Int => Boolean = _ % 3 == 0
    val multipleOfFive: Int => Boolean = _ % 5 == 0

    // Pattern matching based on the input
    val result = (multipleOfThree(input), multipleOfFive(input)) match {
      case (true, true)  => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case (false, false) => "Not a Multiple of Three or Five"
    }

    // Print the result
    println(result)
  }
}
