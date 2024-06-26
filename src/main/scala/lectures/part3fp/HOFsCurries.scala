package org.anderson.learningScala
package lectures.part3fp

import scala.annotation.tailrec

object HOFsCurries extends App {
 class Entidade {
  var valor: String = _
  var teste: Int = _
 }

 val processaLista = () => {
  val retorno = new Entidade
  retorno.valor = "3"
  retorno.teste = 2
  retorno
 }


 val superFunction: (Int, (String, Int => Boolean) => Int) => Int => Int = null
 @tailrec
 def nTimes(f: Int => Int, n: Int, x: Int): Int = if (n <= 0) x else nTimes(f, n-1, f(x))
 val plusOne = (int: Int) => int + 1
 println(nTimes(plusOne, 10, 1))
 def nTimesBetter(f: Int => Int, n: Int): Int => Int = if (n <= 0) (x: Int) => x
 else (x: Int) => nTimesBetter(f, n-1)(f(x))
// def processamento(query: String) = processaLista()
// val dadosTeste: Int = 3
 val plus10 = nTimesBetter(plusOne, 10)
 println(plus10(1))

 val superAdder = (x: Int) => (y: Int) => x + y
 val add3 = superAdder(3)
 println(add3(10))

 def curriedFormatter(c: String)(x: Double): String = c.format(x)
 val standardFormat: Double => String = curriedFormatter("%4.2f")
 val preciseFormat: (Double => String) = curriedFormatter("%10.8f")
 println(standardFormat(Math.PI))
 println(preciseFormat(Math.PI))
}