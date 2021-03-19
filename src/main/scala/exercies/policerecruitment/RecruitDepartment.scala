package exercies.policerecruitment

import exercies.policerecruitment.policemen.Policeman


class RecruitDepartment {

  // Here our candidates passes the test for being good person...or don't
  def checkHonest(people: List[Person]) : List[Person] = {
    people.filter(_.honest)
  }

//   Here we recruit our candidates and it works! YAY
  def recruit(people: List[Person]): List[Policeman]  = {
    people.map(x => Policeman.apply(x))
  }

}