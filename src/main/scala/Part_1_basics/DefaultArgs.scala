package Part_1_basics

object DefaultArgs extends App{

  def trfact(n: Int, acc: Int): Int =
    if (n<= 1) acc
    else trfact(n-1, n*acc)

  val fact10 = trfact(10,1)



  def savepicture(format: String, width: Int, height: Int): Unit = println("saving picture")
  savepicture("jpg",800,600)




}
