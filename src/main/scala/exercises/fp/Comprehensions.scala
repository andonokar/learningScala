package org.anderson.learningScala
package exercises.fp

import exercises.oop.{Cons, Empty, MyListCourse}

object Comprehensions extends App {
  val listOfInt: MyListCourse[Int] = Cons(1, Cons(2, Cons(3, Empty)))
  for {
    x <- listOfInt
  } println(x)
  val test = Just(3)
  val fortest = for {
    x <- test
  } yield x * 2
  println(fortest.maybe)
  println(test.flatMap(x => Just(x % 2 == 0)))
  println(test.filter(_ % 2 == 0))
}
