package org.anderson.learningScala
package lectures.part4pm

import exercises.oop.{Cons, Empty, MyListCourse}

object AllThePatterns extends App {
//  val x: Any = "Scala"
//  val constants = x match {
//    case 1 => "a number"
//    case "Scala" => "THE SCALA"
//    case true => "The truth"
//    case AllThePatterns => "a singleton object"
//  }
//
//  val matchAnything = x match {
//    case _ =>
//  }
//
//  val matchVariable = x match {
//    case something => s"ive found $something"
//  }
//
//  val aTuple = 1 -> 2
//  val matchATuple = aTuple match {
//    case (1,1) =>
//    case (something, 2) => s"ive found $something"
//  }
//
//  val nestedTuple = (1, (2,3))
//  val matchNestedTuple = nestedTuple match {
//    case (_, (2, v)) =>
//  }
//
//  val aList: MyListCourse[Int] = Cons(1, Cons(2, Empty))
//  val matchList = aList match {
//    case Empty =>
//    case Cons(head,tail) =>
//    case Cons(head,Cons(subhead, subtail)) =>
//  }
//  val aNormalList = List(1,2,3,42)
//  val matchNormalList = aNormalList match {
//    case List(1, _, _, _) =>
//    case List(1, _*) =>
//    case 1 :: List(_) =>
//    case List(1,2,3) :+ 42 =>
//  }
//
//  val unknown: Any = 2
//  val matchUnknown = unknown match {
//    case list: List[Int] =>
//    case _ =>
//  }
//
//  val nameBindingMatch = aList match {
//    case nonEmptyList @ Cons(h, t) =>
//    case Cons(1, rest @ Cons(2, t)) =>
//  }
//
//  val multipattarn = aList match {
//    case Empty | Cons(0, _) =>
//  }
//
//  val secondElementSpecial = aList match {
//    case Cons(_, Cons(s, _)) if s % 2 == 0 =>
//  }

  val numbers = List(1,2,3)
  val numbersMatch = numbers match {
    case listOfStrings: List[String] => "list of strings"
    case listOfNumbers: List[Int] => "a list of numbers"
    case _ => ""
  }
  println(numbersMatch)
}
