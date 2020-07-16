import net.liftweb.json.JsonDSL._
import net.liftweb.json.JsonAST._
import net.liftweb.json.JObject
import net.liftweb.json.Serialization.write
import scala.collection.mutable._
import net.liftweb.json._

object App {
  def main(args: Array[String]): Unit = {
    // println("Hello, world")
    val home = System.getProperty("user.home")
    val bufferedSource = io.Source.fromFile(s"${home}/Desktop/Scala_zadanie.csv")

    var firstLevel: Array[Node] = new Array[Node](0)
    var secondLevel: Array[Node] = new Array[Node](0)
    var thirdLevel: Array[Node] = new Array[Node](0)

    for (line <- bufferedSource.getLines.drop(1)) {
      val row = line.split(";")
      val node = new Node()
      node.id = row(3).toInt
      if (row(0) != "") {
        node.text = row(0)
        firstLevel = firstLevel ++ Array(node)
      }
      if (row(1) != "") {
        node.text = row(1)
        secondLevel = secondLevel ++ Array(node)
      }
      if (row(2) != "") {
        node.text = row(2)
        thirdLevel = thirdLevel ++ Array(node)
      }

      //println(row.mkString("Array(", ", ", ")"))
    }

    for (parent <- secondLevel) {
      for (child <- thirdLevel) {
        if (child.text.contains(parent.text)) {
          parent.addChild(child)
        }
      }
    }
    for (parent <- firstLevel) {
      for (child <- secondLevel) {
        if (child.text.substring(0, 1).equals(parent.text)) {
          parent.addChild(child)
        }
      }
    }

    //val json: JObject = "elements" -> firstLevel
    implicit val formats = DefaultFormats
    val json = write(firstLevel)
    println(json)

  }
}
