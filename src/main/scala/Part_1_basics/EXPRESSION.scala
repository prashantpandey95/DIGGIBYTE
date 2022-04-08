package Part_1_basics

object EXPRESSION extends App{

  val x = 1 + 2  // expression
  println(x)

  println(2+3+4)

  println(1 == x)

  println(!(1==x))

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)


  // Instructions (tell computer to do) VS Expression (value)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)



  var i = 0
  while (i < 10) {
    println(i)
    i += 1}


    //NEVER WRITE THIS AGAIN
    // EVERYTHING IN SCALA IS EXPRESSION

    val aWeirdValue = (aVariable = 3) // Unit === void
    println(aWeirdValue)

  // CODE BLOCK
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"

  }
  println(aCodeBlock)

  
  
  
}
