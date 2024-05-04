package org.anderson.learningScala
package exercises.oop

object Empty extends MyListCourse[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyListCourse[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](num: B): MyListCourse[B] = Cons(num, Empty)
  def map[B](transformer: Nothing => B): MyListCourse[B] = Empty
  def flatMap[B](transformer: Nothing => MyListCourse[B]): MyListCourse[B] = Empty
  def filter(predicate: Nothing => Boolean): MyListCourse[Nothing] = Empty

  override def ++[B >: Nothing](list: MyListCourse[B]): MyListCourse[B] = list
  override def printElements: String = ""

  override def foreach(method: Nothing => Unit): Unit = () // remember parenthesiss

  override def sort(method: (Nothing, Nothing) => Int): MyListCourse[Nothing] = Empty

  //
  override def zipWith[B, C](myListCourse: MyListCourse[B], method: (Nothing, B) => C): MyListCourse[C] =
    if (!myListCourse.isEmpty) throw new RuntimeException("Lists does not have same lenght")
    else Empty

  override def fold[B](start: B)(function: (B, Nothing) => B): B = start

}

