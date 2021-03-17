package exercies.blacksmith

final case class Blacksmith[A] (craft: A => String)

object Blacksmith {
  implicit def createSword: Blacksmith[Iron]    = Blacksmith( _ => "Sword from the Iron")
  implicit def createSpear: Blacksmith[Wood]    = Blacksmith( _ => "Spear from the Wood")
  implicit def createTunic: Blacksmith[Leather] = Blacksmith( _ => "Tunic from the Leather")
}

object Forge {
  def sellEquipment[A : Blacksmith](material: A)(implicit master: Blacksmith[A]): String = {
    master.craft(material)
  }
}

object Main extends App {
  println(Forge.sellEquipment(new Iron))

  println(Forge.sellEquipment(new Wood))

  println(Forge.sellEquipment(new Leather))
}
