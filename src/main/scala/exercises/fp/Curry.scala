package org.anderson.learningScala
package exercises.fp

object Curry {
  def toCurry(f: (Int, Int) => Int): Int => Int => Int =
    x => y => f(x, y)
  def fromCurry(f: Int => Int => Int): (Int, Int) => Int =
    (x, y) => f(x)(y)
}
