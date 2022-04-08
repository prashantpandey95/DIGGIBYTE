package Part_1_basics

object valuesVariableTypes extends App{

  val x: Int = 42
  println(x)
  // VALS ARE IMMUTABLE

  val astring: String = "hello" ; val anotherstring = "goodbye"
  print(anotherstring)
  println(astring)
  val aboolean: Boolean = false
  val aCHAR: Char = 'a'
  val aShort: Short = 4613
  val along: Long = 1223458759974
  val aFloat: Float = 2.0f
  val adouble: Double = 3.14

  // VARIABLE
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
