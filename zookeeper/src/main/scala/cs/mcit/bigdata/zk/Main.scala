package cs.mcit.bigdata.zk

object Main extends App {
  val c = new CreateGroup("zoo")
  c.connect("172.16.129.58:2181")
  c.operation()
  c.close()
}
