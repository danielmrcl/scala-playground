import akka.NotUsed
import akka.actor.typed.{Behavior, Terminated}
import akka.actor.typed.scaladsl.Behaviors

object SetupActor {

  def apply(): Behavior[NotUsed] = Behaviors.setup {
    context => Behaviors.receiveSignal {
      case (context, Terminated(signal)) => Behaviors.stopped
    }
  }

}
