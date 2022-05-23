object Leap {
  def leapYear(year: Int): Boolean = {
    val divisibleBy = (i: Int) => year % i == 0

    divisibleBy(4) && !divisibleBy(100) || divisibleBy(400)
  }
}
