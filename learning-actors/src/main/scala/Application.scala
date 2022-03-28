import ActorDB.Message
import akka.actor.typed.ActorSystem

object Application {

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem(SetupActor(), "SetupActor")
    val actorRef = actorSystem.systemActorOf(ActorDB(), "ActorDB")

    // Same call:
    actorRef ! Message("Foo", "1234")
    actorRef tell Message("Bar", "1234")
    actorRef.tell(Message("John", "1234"))
  }

}
