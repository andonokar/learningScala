package org.anderson.learningScala
package lectures.part3fp

object Options extends App {
  val myFristOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None
  println(myFristOption)
  println(noOption)

  def unsafeMethod(): String = null
//  val result = Some(null)
  val result = Option(unsafeMethod())
  println(result)

  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  println(myFristOption.isEmpty)
  println(noOption.getOrElse("test"))

  println(myFristOption.map(_ * 2))
  println(myFristOption.filter(_ > 10))
  println(myFristOption.flatMap(x => Option(x * 10)))



}
