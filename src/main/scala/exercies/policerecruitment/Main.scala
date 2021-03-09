package exercies.policerecruitment


object Main {

  def main(args: Array[String]): Unit = {

    val Todd      = new Person("Todd Howard", 1.5, true, false)
    val Alistair  = new Person("Alistair Theirin", 2.0, true, true)
    val Anduin    = new Person("Anduin Rinn", 0.5, true, true)
    val Lara      = new Person("Lara Croft", 3.0, true, true)


    val peopleCV = List(Todd, Alistair, Anduin, Lara)

    val recruitDep = new RecruitDepartment

    val candidates = recruitDep.checkHonest(peopleCV)

    val newbies = recruitDep.recruit(candidates)

    println(newbies)
  }

}
