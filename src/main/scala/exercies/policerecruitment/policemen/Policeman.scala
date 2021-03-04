package exercies.policerecruitment.policemen

import exercies.policerecruitment.Person

// Abstract unit
abstract class Policeman {
  def name:         String
  def department :  String
  def weapon:       String

  override def toString: String =
    department + ": " + getClass.getName + ". " + name + "."
}

object Policeman {
  // Creates concrete Policeman based on Person's experience and how smart he is
  def recruit(unit: Person): Policeman =  {
    if(unit.exp < 1.0) {
      new Patrol(unit.name)
    } else if(unit.smart) {
      new Detective(unit.name,"Ford")
    } else
      new OperativeOfficer(unit.name,"alpha")
  }
}
