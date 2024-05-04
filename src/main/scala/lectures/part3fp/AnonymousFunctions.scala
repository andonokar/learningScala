package org.anderson.learningScala
package lectures.part3fp

object AnonymousFunctions extends App {
  val doubler = (x: Int) => x * 2
  val adder = (x: Int, y: Int) => x + y
  val justDoSomething = () => 3
  println(justDoSomething)
  println(justDoSomething())

  val stringToInt = {
    (str: String) =>
      str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _
}
