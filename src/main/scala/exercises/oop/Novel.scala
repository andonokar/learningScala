package org.anderson.learningScala
package exercises.oop

import java.time.Year

class Novel(val name: String, releaseYear: Int, author: Writer) {
  def authorAge: Int = Year.now.getValue - author.year
  def isWrittenBy(name: String): Boolean = name == author.fullName
  def copy(year: Int) = new Novel(name, year, author)
}
