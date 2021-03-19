package exercies.policerecruitment.policemen

// Experienced employees
class OperativeOfficer(val name: String,
                       val team: String) extends Policeman {

  override def weapon: String = "MP5"
  override def department: String = "D03 Operative Department"

}