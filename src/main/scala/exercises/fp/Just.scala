package org.anderson.learningScala
package exercises.fp

case class Just[+T](maybe: T) extends Maybe[T] {
  def map[B](transformer: T => B): Just[B] =
    Just(transformer(maybe))

  override def flatMap[B](f: T => Maybe[B]): Maybe[B] = f(maybe)

  override def filter(p: T => Boolean): Maybe[T] = if (p(maybe)) this else MaybeNot
}
