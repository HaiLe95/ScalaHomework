package exercies.exerciesepi

import scala.util.Random

class MonteCarlo {

  // Find a Pi value using Random that generates num from 0 to 1

  /* Okay first thing first.
            How we can get Pi value?
            Pi value is used in basic geometry like Area of Circle S = Pi * R^2 where R is radius.
            Okay lets use this formula to get the Pi. Imagine that our circle's radius is 1, so our area should
            be S = Pi * 1^2. Basically S is Pi itself.
            But it could be too easy if we've already known the value.

     Continuing diving inside the school math.
            Lets imagine that our circle is nested in a square. Our side of the Square is equal to the diameter,
            or double of the radius or just 2. That means that our area of Square is A * A, where A is 2*R, or just 2.
            S = (2R)^2; S = 2 ^ 2. In case it is 4;
            So basically the relation between the area of square and area of circle is 4/Pi. Why we should know this?

     Here the best part is coming.
            Okay we are using randomizer that returns a value from 0 to 1, hopefully not only a Integer type.
            This is quite useful because our outer Square isn't wider than 2. But we'll be using only one part of the
            Square and Circle, where x and y are positive.
            And here comes the magic.
            Lets spam the dots, that have x and y values from randomizer. We can understand is this dot belong to the circle or not.
            How? We're already have the x and y values, that represents a side of a Triangle. All we need is using Pythagoras theorem
            get the value of longest side. And if it is shorter that 1(the radius) this dot belongs to the Circle. Otherwise it belongs
            only to the Square.
            By dividing the number of all dots to the inner we can get that relation between the area of square and the area of circle.
            And finally get the Pi value just getting Pi from the relation: Pi = (4 inner dots) / all dots
            It's better to spam a large amount of dots for more relevant result.
  */

  def getPiValue(accuracy: Int): Float = {
    val rnd       = Random
    val matching  = LazyList.fill(accuracy)(
      if(Math.pow(rnd.nextFloat(), 2) + Math.pow(rnd.nextFloat(), 2) < 1) {
        1
      } else {
        0
      }
    ).sum
    4 * matching.toFloat / accuracy.toFloat
  }
}