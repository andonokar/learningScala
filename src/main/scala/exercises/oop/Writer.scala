package org.anderson.learningScala
package exercises.oop

class Writer(val firstName: String, val surName: String, val year: Int) {
  def fullName = s"$firstName + $surName"
}
