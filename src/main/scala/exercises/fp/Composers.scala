package org.anderson.learningScala
package exercises.fp

object Composers {
  def compose[A, B, T](f: A => B, g: T => A): T => B =
    x => f(g(x))
  def andThen[A, B, T](f: A => B, g: B => T): A => T =
    x => g(f(x))
}
