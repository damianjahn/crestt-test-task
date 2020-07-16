trait TNode[T] {
  def getData(): Unit
  def addChild(child: T): Unit
  var children: Array[T]
  var id: Int
  var text: String
}
