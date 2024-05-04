package org.anderson.learningScala
package exercises.oop

object ListTest extends App {
  val list = new Cons(1, Empty)
  println(list.head)
  println(list.add(4).head)
  println(list.isEmpty)
  println(list.toString)
}
