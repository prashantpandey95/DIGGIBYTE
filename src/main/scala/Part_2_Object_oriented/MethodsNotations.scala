package Part_2_Object_oriented

object MethodsNotations extends App{

  class Person(val name: String, favouriteMovie: String,val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangoutwith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and i like $favouriteMovie"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)

    def learns(thing: String) = s"$name is learning thing"
    def learnScala = this learns "scala"
  }

  val mary = new Person("Mary", "inception")
  println(mary.likes("inception"))
  println(mary likes "inception")  // infix notation = operator notation

  val tom = new Person("Tom", "Fight club")
  println(mary hangoutwith tom)
  // println(mary + tom)

  // "OPERATORS in SCALA

  // Prefix notation
  val x = -1   // - is unary operator
  val y = 1.unary_-
  // unary_ prefix only works with - +

  println(!mary)
  println(mary.unary_!)


  // Postfix

  println(mary.isAlive)
  //println(mary isAlive)


  // apply
  println(mary.apply())
  println(mary())





    /*
    1. overload the + operator
          mary + "ther rockstar"  => new person "mary (the rockstar)
    2. add an age to the person class
          add a unary + operator  => new person with the age + 1
          +mary => mary with the age incrementer
    3. add a "learners" method in the person class => "mary learns scala"
        add a learnerscala method, calls learns method with "scala".
        use it in postfix notation
    4.  overload the apply method
        mary.apply(2)  => "mary watched inception 2 times"

     */

  println((mary + "the rockstar").apply())
  println((+mary).age)
  println(mary.learnScala)

}