package exercies.policerecruitment.policemen

// Smart and experienced employee
class Detective(val name: String,
                val carModel: String) extends Policeman{

  override def department: String = "D02 Investigation Department"
  override def weapon: String = "service pistol"

}