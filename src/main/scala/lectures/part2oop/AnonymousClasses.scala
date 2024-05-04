package org.anderson.learningScala
package lectures.part2oop

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahahaha")
  }
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"hi, my name is $name, how can i help")
  }
  val jim = new Person("jim") {
    override def sayHi: Unit = super.sayHi
  }
  jim.sayHi
}
