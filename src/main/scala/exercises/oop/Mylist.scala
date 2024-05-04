package org.anderson.learningScala
package exercises.oop

abstract class Mylist {
  def head: Int
  def tail: Int
  def isEmpty: Boolean
  def add(num: Int): Mylist
  var before: Mylist = _
  var next: Mylist = _
}

