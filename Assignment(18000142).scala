package ciser

object FPmap {
   def main(args:Array[String])f
  {
    val originalalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    val inputmsg = scala.io.StdIn.readLine("enter your secret massage : ")
    val shiftnumber = (scala.io.StdIn.readLine("Shifted by : ").toInt + originalalphabet.size)%originalalphabet.size
    
    val outputmsg = inputmsg.map((letter: Char)=>
    {
      val x = originalalphabet.indexOf(letter.toUpper)
      
      if(x == -1)
      {
        letter
      }
      else
      {
        originalalphabet((x + shiftnumber) % originalalphabet.size)
      }
    });
    
    println(outputmsg)
  }
}
