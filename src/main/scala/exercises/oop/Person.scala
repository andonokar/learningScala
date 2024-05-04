package org.anderson.learningScala
package exercises.oop

class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
  def likes(movie:String):Boolean =movie ==favoriteMovie

  def hangsOutWith(person:Person):String =s"$name is hanging out with ${person.name}"

  def unary_! : String = s"$name, what the heck?!"

  def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

  def isAlive:Boolean = true

  def +(str:String):Person = new Person(s"$name ($str)", favoriteMovie)

  def apply():String =s"Hi, my name is $name and I like $favoriteMovie"

  def learns(str: String): String = s"$name learns $str"
  def learnsScala: String = this learns "Scala"
  def apply(number: Int): String = s"$name watched $favoriteMovie $number times"
}
