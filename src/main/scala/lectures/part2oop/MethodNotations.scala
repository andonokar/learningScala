package org.anderson.learningScala
package lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangsOutWith(person: Person): String = s"$name is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def +(person: Person): String = s"$name + ${person.name}"
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val lia = new Person("Lia", "Run")
  println(lia.likes("Run"))
  println(lia likes "Run") // equivalent
  // infix notation = operator notation (syntatic sugar)

  // "operators" in Scala
  val ander = new Person("Ander", "Toy Story")
  println(lia hangsOutWith ander)

  val a = lia + ander

  println(1.+(2))
  // ALL OPERATORS ARE METHODS.
  // Akka actor have ! ?

  // prefix notation
  val x = -1
  val y = 1.unary_-
  // unary_ prefix onlu works with - + ~ !
  println(!ander)

  // postfix notation
  println(lia.isAlive)
  println(lia isAlive)

  // apply
  println(lia.apply())
  println(lia())
}
