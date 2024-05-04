package org.anderson.learningScala
package exercises.oop

case object TestListCourse extends App {
  val listOfInt: MyListCourse[Int] = Cons(1, Cons(2, Cons(3, Empty)))
  val anotherListOfInt: MyListCourse[Int] = Cons(1, Cons(4, Empty))
  val listOfStr: MyListCourse[String] = Cons("Hello", Cons("Scala", Empty))
  println(listOfInt.toString)
  println(listOfStr.toString)
  println(listOfInt.map((elem: Int) => elem * 2).toString)
  println(listOfInt.filter((elem: Int) => elem % 2 == 0).toString)
  println((listOfInt ++ anotherListOfInt).toString)
  println(listOfInt.flatMap((elem: Int) => Cons(elem, Cons(elem + 1, Empty))).toString)
  listOfInt.foreach(println)
  println(listOfInt.sort((x, y) => y - x))
  println(anotherListOfInt.zipWith[String, String](listOfStr, _ + "-" + _))
  println(listOfInt.fold(1)(_ + _))
}
