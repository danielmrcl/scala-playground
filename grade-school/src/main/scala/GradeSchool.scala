import scala.collection.immutable.SortedMap

class School {
  var db = SortedMap[Int, Seq[String]]()

  def add(name: String, g: Int) = { db = db + (g -> (grade(g) :+ name)) }
  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())
  def sorted = db.mapValues(_.sorted).toMap
}

