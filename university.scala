import akka.actor.{Actor, Props}

object PUnivesity {
  case class createDepartement(name:String)
}


class University extends Actor {
  import PUnivesity._

  override def receive: Receive = {

    case createDepartement(name) =>

      val department  = context.actorOf(Props(classOf[Department], name), name+"Actor")
     // department !

      sender ! department
      println(department)
  }
}