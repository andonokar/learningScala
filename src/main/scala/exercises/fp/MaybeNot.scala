package org.anderson.learningScala
package exercises.fp

case object MaybeNot extends Maybe[Nothing]{
  override def map[B](transformer: Nothing => B): Maybe[B] = MaybeNot

  override def flatMap[B](f: Nothing => Maybe[B]): Maybe[B] = MaybeNot

  override def filter(p: Nothing => Boolean): Maybe[Nothing] = MaybeNot

}
