package org.anderson.learningScala
package lectures.part2oop

object Generics extends App {
  class Mylist[+A] {
    def add[B >: A](elem: B): Mylist[B] = ???
    // use the type A
  }
  class MyMap[Key, Value]
  val listOfInt = new Mylist[Int]
  val listofString = new Mylist[String]

  object Mylist {
    def empty[A]: Mylist[A] = ???
  }
  val emptyListOfInt = Mylist.empty[Int]
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // yes List[Cat] extends List[Animal] = Covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? Hard question => We return a list of animals

  // no = Invariance
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // hell, no = contravariant
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

}
