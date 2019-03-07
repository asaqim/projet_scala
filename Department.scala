import akka.actor.Actor

class Department(name:String) extends Actor{

  override def receive: Receive = {
    case _ =>
      println("ok")

  }
}
