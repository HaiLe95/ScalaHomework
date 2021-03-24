package exercies.policerecruitment.policemen

// Unexperienced employees
class Patrol(val name: String) extends Policeman{

  override def department:  String = "D01 Patrol Department"
  override def weapon:      String = "service pistol"

}