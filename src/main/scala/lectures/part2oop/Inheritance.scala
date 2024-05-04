package org.anderson.learningScala
package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat(): Unit = println("nomnom")
  }
  class Cat extends Animal {
    def crunch(): Unit = {
      eat()
    }
  }
  val cat = new Cat
  cat.crunch()

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
    def this(age: Int) = this("ander", age)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overrriding
  class Dog(override val creatureType: String) extends Animal {
    // override val creatureType: String = "domestic"
    override def eat(): Unit = super.eat()
  }
  // type substitution
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat()
  // overriding vs overloading

  // super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on class
  // 3 - seal the class = extend classes in THIS FILE, but not in others
}
