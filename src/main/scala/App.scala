object App {
  def main(args: Array[String]): Unit = {
    // println("Hello, world")
    val home = System.getProperty("user.home")
    val bufferedSource = io.Source.fromFile(s"${home}/Desktop/Scala_zadanie.csv")
    for (line <- bufferedSource.getLines.drop(1)) {
      val columns = line.split(";")
      println(columns.mkString("Array(", ", ", ")"))
    }

  }

}
