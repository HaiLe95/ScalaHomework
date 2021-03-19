package exercies.blacksmith

final case class Blacksmith[A] (craft: A => String)

object Blacksmith {
  implicit def createSword: Blacksmith[Iron]    = Blacksmith( _ => "Sword from the Iron")
  implicit def createSpear: Blacksmith[Wood]    = Blacksmith( _ => "Spear from the Wood")
  implicit def createTunic: Blacksmith[Leather] = Blacksmith( _ => "Tunic from the Leather")
}