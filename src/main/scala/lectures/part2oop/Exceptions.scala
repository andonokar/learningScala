package org.anderson.learningScala
package lectures.part2oop

object Exceptions extends App {
  val x: String = null
//  print(x.length)
//  val aWeirdValue: Nothing = throw new NullPointerException
  // Exception(NullPointer) and Error(StackOverflow)
  def getInt(withException: Boolean): Int =
    if (withException) throw new RuntimeException("No int for You")
    else 42

  val portentialFail = try {
    getInt(true)
  } catch {
    case e: RuntimeException => 43
  } finally {
    // optional and does not influence the return
    println("finally")
  }
  println(portentialFail)

//  class MyException extends Exception
//  throw new MyException
//  throw new OutOfMemoryError
//  throw new StackOverflowError
}
