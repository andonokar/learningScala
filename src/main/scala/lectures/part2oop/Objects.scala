package org.anderson.learningScala
package lectures.part2oop

object Objects extends App {
  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY("static")
  object Person { // type + only instance
    // static/class level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instannce-level functionality
  }
  // COMPANIONS
  println(Person.N_EYES)
  println(Person.canFly)
  // Scala object = SINGLETON INSTANCE
  val lia = new Person("Lia")
  val ander = new Person("Ander")
  println(lia == ander)
  val bobbie = Person(lia, ander)

  // Scala Applications = Scala object with def main(args: Array[String]): Unit
}
