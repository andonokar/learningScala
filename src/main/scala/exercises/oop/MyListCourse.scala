package org.anderson.learningScala
package exercises.oop

import lectures.part2oop.Generics.Mylist

abstract class MyListCourse[+A] {
  def head: A
  def tail: MyListCourse[A]
  def isEmpty: Boolean
  def add[B >: A](elem: B): MyListCourse[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"
  def map[B](transformer: A => B): MyListCourse[B]
  def flatMap[B](transformer: A => MyListCourse[B]): MyListCourse[B]
  def filter(predicate: A => Boolean): MyListCourse[A]
  def ++[B >: A](list: MyListCourse[B]): MyListCourse[B]
  def foreach(method: A => Unit): Unit // correct
  def sort(method: (A, A) => Int): MyListCourse[A]
  def zipWith[B, C](myListCourse: MyListCourse[B], method: (A, B) => C): MyListCourse[C]
  def fold[B](start: B)(function: (B, A) => B): B
}
