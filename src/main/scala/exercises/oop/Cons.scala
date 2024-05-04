package org.anderson.learningScala
package exercises.oop

case class Cons[+A](h: A,  t:  MyListCourse[A]) extends MyListCourse[A] {
  def head: A = h
  def tail: MyListCourse[A] = t
  def isEmpty: Boolean = false
  def add[B >: A](num: B): MyListCourse[B] = new Cons(num, this)

  override def printElements: String = if (t.isEmpty) "" + h else h + " " + t.printElements
  def filter(predicate: A => Boolean): MyListCourse[A] =
    if (predicate(h)) new Cons(h, t.filter(predicate))
    else t.filter(predicate)
  def map[B](transformer: A => B): MyListCourse[B] =
    new Cons(transformer(h), t.map(transformer))

  override def ++[B >: A](list: MyListCourse[B]): MyListCourse[B] = Cons(h, t ++ list)


  override def flatMap[B](transformer: A => MyListCourse[B]): MyListCourse[B] =
    transformer(h) ++ t.flatMap(transformer)

  override def fold[B](start: B)(function: (B, A) => B): B = {
    t.fold(function(start, h))(function)
  }

  override def foreach(method: A => Unit): Unit = {
    method(h)
    tail.foreach(method)
  }

  override def sort(method: (A, A) => Int): MyListCourse[A] = {
    def insert(x: A, sortedList: MyListCourse[A]): MyListCourse[A] = if (sortedList.isEmpty) Cons(x, Empty)
    else if (method(x, sortedList.head) <= 0) Cons(x, sortedList)
    else Cons(sortedList.head, insert(x, sortedList.tail))
    val sortedTail = t.sort(method)
    insert(h, sortedTail)
  }

  override def zipWith[B, C](myListCourse: MyListCourse[B], method: (A, B) => C): MyListCourse[C] =
    if (myListCourse.isEmpty) throw new RuntimeException("Lists does not have same lenght")
    else Cons(method(h, myListCourse.head), t.zipWith(myListCourse.tail, method))
}