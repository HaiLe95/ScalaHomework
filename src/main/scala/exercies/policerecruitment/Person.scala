package exercies.policerecruitment

// Just representation of someone who wants to be a policeman
class Person(val name: String,
             val exp: Double,
             val smart: Boolean,
             val honest: Boolean) {

  override def toString: String = name

}
