package org.anderson.learningScala
package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction: Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int , p: String = ""): String = {
    if (n == 1) aString + p
    else aRepeatedFunction(aString, n-1, p + aString)
  }
  println(aRepeatedFunction("hello", 20000))
  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  def aGreetFunction(name: String, age: Int): Unit =
    println(s"Hi my name is $name and I am $age years old.")
  aGreetFunction("Lia", 28)

  def factorial(n: Int): Int =
    if (n == 1) 1 else n * factorial(n - 1)
  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1 else fibonacci(n-1) + fibonacci(n-2)
  println(fibonacci(7))

  def isPrime(n: Int, p: Int = 2): Boolean =
    if (n/2 + 1 == p) true else n % p != 0 && isPrime(n, p+1)
  println(isPrime(25))
  println(isPrime(137))
}
