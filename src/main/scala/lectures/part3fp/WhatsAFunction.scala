package org.anderson.learningScala
package lectures.part3fp

object WhatsAFunction extends App{
  trait MyFunction[A, B] {
    def apply(element: A): B
  }
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))
  val stringToIntConverter = new Function[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }
  println(stringToIntConverter("3") + 4)
  val adder: (Int, Int) => Int = (v1: Int, v2: Int) => v1 + v2

  val concatenateString: (String, String) => String = (v1: String, v2: String) => s"$v1 + $v2"

  val returnInt = (v1: Int)  => v1

  val returnFunction =  (v1: Int) => returnInt(v1)

  val specialFunction = (v1: Int) => (v2: Int) => v1 + v2

  val adder3 = specialFunction(3)
  println(adder3(4))


}
