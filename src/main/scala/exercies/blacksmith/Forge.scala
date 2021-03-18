package exercies.blacksmith

object Forge {
  def sellEquipment[A : Blacksmith](material: A)(implicit master: Blacksmith[A]): String = {
    master.craft(material)
  }
}
