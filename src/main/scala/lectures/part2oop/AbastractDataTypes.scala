package org.anderson.learningScala
package lectures.part2oop

object AbastractDataTypes extends App{
  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }
  class Dog extends Animal{
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }
  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }
  trait ColdBooded
  class Crocodile extends Animal with Carnivore with ColdBooded {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }
  // traits vs abstract classes
  // 1 - traits do not have consctuctor parameters
  // 2 - multiple traits but only 1 class can be inherited
  // 3 - traits - behavior, abstract class = "thing"
}
