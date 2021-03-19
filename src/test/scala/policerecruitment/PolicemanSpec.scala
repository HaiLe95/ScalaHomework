package policerecruitment

import exercies.policerecruitment._
import org.scalatest.FlatSpec
import org.scalatest.Matchers

class PolicemanSpec extends FlatSpec with Matchers {

  "Person".should(" have to be smart to be a detective").in({
    val candidate = new Person("Jonny", 2.5, true, true)
    candidate.smart.should(be(true))
  })

  it.should(" have to be well experienced to be a operative officer").in({
    val candidate = new Person("Lisa", 4.0, true, true)
    candidate.exp.should(be(4.0))
  })

  it.should(" can't be evil").in({
    val candidate = new Person("Dr.Evil", 4.5, true, false)
    candidate.honest.should(be(false))
  })

}
