package org.anderson.learningScala
package lectures.part3fp

object TuplesAndMaps extends App {
  val aTuple = (2, "hello scala")
  println(aTuple._1)
  println(aTuple.copy(_2 = "goodbye java"))
  println(aTuple.swap)

  val aMap = Map()
  val phonebook = Map(("Jim", 555),"Daniel" -> 789).withDefaultValue(-1)
  println(phonebook)

  println(phonebook.contains("Jim"))
  println(phonebook("Lia"))

  val newPairing = "Lia" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))
  println(phonebook.filterKeys(_.startsWith("J")))
  println(phonebook.mapValues(_ * 10))
  println(phonebook.toList)
  println(List("Daniel" -> 555).toMap)
  val names = List("Bob", "James", "Lia", "Amor", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))
}
