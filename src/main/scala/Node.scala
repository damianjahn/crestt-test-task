import scala.math.Equiv.String

case class Node() extends TNode[Node] {
  override def addChild(child: Node) : Unit  = {
    this.children = this.children ++ Array(child)
  }


  override def getData(): Unit = {
    // for element in children getData()
    // + "id : " + id
    //
    //for (String <- children) Array[T]

  }

  override var children: Array[Node] = Array()
  override var id: Int = 0
  override var text: String = ""
}
