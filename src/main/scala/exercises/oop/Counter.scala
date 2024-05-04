package org.anderson.learningScala
package exercises.oop

class Counter(count: Int) {
  def currentCount: Int = count
  def increment: Counter = new Counter(count + 1)
  def decrement: Counter = new Counter(count - 1)
  def increment(add: Int): Counter = new Counter(count + add)
  def decrement(remove: Int): Counter = new Counter(count - remove)
}
