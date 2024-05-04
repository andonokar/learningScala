package org.anderson.learningScala
package lectures.part3fp

import scala.util.{Failure, Random, Success, Try}

object HandlingFailure extends App {
  val aSucess = Success(3)
  val aFailure = Failure(new RuntimeException("SUPER FAILURE"))
  println(aSucess)
  println(aFailure)
  def unsafemethod(): String = throw new RuntimeException("NO STRING FOR YOU BUSTER")
  // Try objects
  val potentialFailure = Try(unsafemethod())
  println(potentialFailure)

  val anotherPotentialFailure = Try {

  }
  println(potentialFailure.isSuccess)
  println(potentialFailure.getOrElse("teste"))

  println(aSucess.map(_ * 2))
  println(aSucess.flatMap(x => Success(x * 10)))
  println(aSucess.filter(_ > 10))

  val hostname = "localhost"
  val port = "8080"
  def renderHTML(page: String): Unit = println(page)
  class Connection {
    def get(url: String): String = {
      val random = new Random(System.nanoTime())
      if (random.nextBoolean()) "<html>"
      else throw new RuntimeException("Connection interrupted")
    }
  }
  object HttpService {
    val random = new Random(System.nanoTime())
    def getConnectionn(host: String, port: String): Connection =
      if (random.nextBoolean()) new Connection
      else throw new RuntimeException("Someone else took the port")
  }
  for {
    service <- Try(HttpService.getConnectionn(hostname, port))
    connection <- Try(service.get("umsitequalquer"))
  } renderHTML(connection)
}
