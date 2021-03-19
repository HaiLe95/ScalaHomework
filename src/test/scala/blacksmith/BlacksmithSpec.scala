package blacksmith

import exercies.blacksmith._

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class BlacksmithSpec extends FlatSpec with Matchers {

  "Blacksmith can only".should("make sword from iron").in({
    val sword = Forge.sellEquipment(new Iron)
    sword.should(be("Sword from the Iron"))
  })

  it.should("make spear with wood").in({
    val spear = Forge.sellEquipment(new Wood)
    spear.should(be("Spear from the Wood"))
  })

  it.should("craft tunic based on leather").in({
    val tunic = Forge.sellEquipment(new Leather)
    tunic.should(be("Tunic from the Leather"))
  })

}
