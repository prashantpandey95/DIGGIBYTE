package Part_1_basics

object Stringops extends App{

  val str: String = "hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)


  val anumberstring = "45"
  val anumber = anumberstring.toInt
  println('a' +: anumberstring :+ 'z')
  println(str.reverse)
  println(str.take(2))



  // Scala - specific: String interpolators
  // S - Interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age year old"
  val anothergreeting = s"Hello, my name is $name, and i will be turning $age year old"
  println(greeting)
  println(anothergreeting)


  // F - Interplotators
  val speed = 1.25f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw - interplotators

  println(raw"this is a /n newline")
}
