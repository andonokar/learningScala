package org.anderson.learningScala
package exercises.fp

object Collections extends App {
  val phonebook = Map("Jim" -> 555, "JIM" -> 900, "Ronaldo" -> "233")
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))
  case class SocialMedia(map: Map[String, Set[String]] = Map()) {
    def addPerson(person: String): SocialMedia =
      SocialMedia(map + (person -> Set()))
    def removePerson(person: String): SocialMedia = SocialMedia(map.mapValues(_.filter(_ != person)) - person)
    val addFriend: String => String => SocialMedia = (person1: String) => (person2: String) =>
      SocialMedia(map + ((person1, map(person1) + person2), (person2, map(person2) + person1)))
    val removeFriend: String => String => SocialMedia = (person1: String) => (person2: String) =>
      SocialMedia(map + ((person1, map(person1).filter(_ != person2)), (person2, map(person2)
        .filter(_ != person1))))
  }
  val teste = SocialMedia().addPerson("Lia").addPerson("Ander").addFriend("Lia")("Ander").addPerson("Roberto")
    .addFriend("Ander")("Roberto").addFriend("Lia")("Roberto").removeFriend("Lia")("Roberto")
    .removePerson("Roberto")
  println(teste)
}
