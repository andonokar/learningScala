package org.anderson.learningScala
package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1 else {
      println("computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("computing factorial of " + n + " - I first need factorial of " + (n-1))
      result
    }

  def anotherFactorial(n: Int): Int = {
    @tailrec
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the last expression

    factHelper(n, 1)
  }
  // WHEN YOU NEED LOOPS, USE TAIL RECURSION
  @tailrec
  def aRepeatedFunction(aString: String, n: Int , p: String = ""): String = {
    if (n == 1) aString + p
    else aRepeatedFunction(aString, n-1, p + aString)
  }
  @tailrec
  def isPrime(n: Int, p: Int = 2): Boolean =
    if (n/2 + 1 == p) true else n % p != 0 && isPrime(n, p+1)
  println(isPrime(2003))

  @tailrec
  def fibonacci(n: BigInt, p: BigInt = 1, last: BigInt = 1): BigInt =
    if (n <= 2) p else fibonacci(n-1, p + last, p)
  println(fibonacci(50000))
}
