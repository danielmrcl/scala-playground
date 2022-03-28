import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object ActorDB {

  case class Message(name: String, document: String)

  def apply(): Behavior[Message] = Behaviors.receive {
    (context, message) =>
      context.log.info(s"Persistindo dados de $message")
      Behaviors.same
  }

}
