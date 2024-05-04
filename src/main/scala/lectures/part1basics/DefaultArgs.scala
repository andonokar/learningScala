package org.anderson.learningScala
package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def factHelper(x: Int, accumulator: Int = 1): Int =
    if (x <= 1) accumulator
    else factHelper(x - 1, x * accumulator)

  def savePicture(format: String, width: Int, height: Int): Unit = println("saving picture")
  savePicture("jpg", 800, 600)
}
