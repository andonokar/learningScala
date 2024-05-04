package org.anderson.learningScala
package exercises.oop

object TesteList extends App {
  val x = new LinkedList(2)
  val y = x.add(3).add(4).add(5).add(10)
  println(y.head)
  println(y.tail)

}
