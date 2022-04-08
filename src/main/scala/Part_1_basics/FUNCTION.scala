package Part_1_basics

object FUNCTION extends App {
  def aFunction(a: String, b:Int): String = {
    a + " " + b
  }
  println(aFunction("HELLO", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())


  def aRepeatedFunction (aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)

  }
  println(aRepeatedFunction("hello ",3))

  // WHEN  YOU NEED LOOPS, USE RECURSION

  def aFunctionwithSideEffects(aString: String): Unit = println(aString)


  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }

  /*
  1. A greeting function(name, age) => "Hi, my name is $name and I am $age year old."
  2. Factorial function 1*2*3*4*5 = 120
  3. Fibonacci function
    f(1) = 1, f(2) = 1, f(n) = f(n-1) + f(n -2)
  4. if a prime number
  */

  def greeting(name: String, age: Int): String = {
    "Hi, my name is " +name + " and I am " + age + " year old."
  }
  println(greeting("Prashant", 27))

/*
  def factorial(n: Int): Int = {
    if (n == 1) n
    else
      var i = 1
      while (i = n) {
      println(i)
      i = i * i
      }
  }
*/

  def factorial(n: Int): Int =
    if (n<=0) 1
    else n * factorial(n-1)

  println(factorial(5))


  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  println(fibonacci(5))




}
