import akka.agent.Agent
import scala.concurrent.ExecutionContext.Implicits.global

object AgentCompositionApp extends App {
  val ag1 = Agent("Hello, ")
  val ag2 = Agent("abdo")
  val ag3=Agent("145")
  val fagent = for {
    x <- ag1
    y <- ag2
    z<- ag3
  } yield (x + y+z)
  println(s"Final agent result is ${fagent.get}")
}