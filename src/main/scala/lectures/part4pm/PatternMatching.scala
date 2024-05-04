package org.anderson.learningScala
package lectures.part4pm

import scala.util.Random

object PatternMatching extends App {
  val random = new Random
  val x = random.nextInt(10)
  val description = x match {
    case 1 => "the ONE"
    case 2 => "Double or nothing"
    case 3 => "third time is the charm"
    case _ => "something else"
  }
  println(x)
  println(description)

  case class Person(name: String, age: Int)
  val bob = Person("Bob", 20)
  val greeting = bob match {
    case Person(n, a) if a < 21 => s"hi my name is $n and i cant drink in usa"
    case Person(n, a) => s"hi my name is $n and i am a $a years old"
    case _ => "i dont know who i am"
  }
  println(greeting)

  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal
  val animal = Dog("Terra Nova")
  animal match {
    case Dog(b) => println(s"matched dog of the $b")

  }
}
