package org.anderson.learningScala
package exercises.fp

abstract class Maybe[+T] {
  def map[B](transformer: T => B): Maybe[B]
  def flatMap[B](f: T => Maybe[B]): Maybe[B]
  def filter(p: T => Boolean): Maybe[T]
}
