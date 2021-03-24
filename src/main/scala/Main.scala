import com.typesafe.scalalogging.Logger

import scala.util.Random

object Main extends App {

  val logger = Logger("STAR WARS THE REVENGE OF THE SITH")

  val rnd = Random

  // ANAKIN AND OBI WAN FIGHT.
  //              They swing with their lightsabers, every swing has it's own level of skill.
  //              Whenever sabers cross we check how skillful was a swing. And gives a score to a better master.
  //              At the end destiny chooses a winner. It is a battle to death.(kinda)

  logger.info("*the sound of lightsabers turning on*")
  val destiny = LazyList.fill(11)(
    if(rnd.nextFloat() < rnd.nextFloat()) {
      logger.warn("Kenobi: I'm on the highground")
      1
    } else {
      logger.warn("Anakin: Don't underestimate my power")
      0
    }).sum

  if(5 < destiny) {
    logger.error("Kenobi: You were the chosen one!")
  } else {
    logger.error("*Anakin wins*")
  }
}