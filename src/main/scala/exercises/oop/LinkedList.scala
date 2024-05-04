package org.anderson.learningScala
package exercises.oop

class LinkedList(value: Int) extends Mylist {

  override def add(num: Int): Mylist = {
    this.next = new LinkedList(num)
    this.next.before = this
    this.next
  }

  override def head: Int = if (before == null) value else before.head

  override def tail: Int = if (next == null) value else next.tail

  override def isEmpty: Boolean = false

}