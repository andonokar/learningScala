package org.anderson.learningScala
package lectures.part3fp

object MapFlatMapFilterFor extends App {
  val list = List(1,2,3)
  println(list.head)
  println(list.tail)
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))
  println(list.filter(_ % 2 == 0))
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))
  val numbers = List(1,2,3,4)
  val chars = List('a','b','c','d')
  val colors = List("black", "white")
  val chess: List[Char] => Int => List[Any] = (x: List[Char]) => (y: Int) => if (x.nonEmpty) List("" + y + x.head, chess(x.tail)(y)) else List()
  println(numbers.flatMap(chess(chars)))
  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n ))
  val combinations2 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => ""+ c + n+ color)))
  println(combinations)
  println(combinations2)

  list.foreach(println)

  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + color
  println(forCombinations)

  for {
    n <- numbers
  } println(n)

  list.map { x =>
    x * 2
  }
}
