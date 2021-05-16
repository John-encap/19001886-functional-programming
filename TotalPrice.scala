
object TotalPrice extends App{
 def price(n:Int):Double=n*24.95*0.4+50*3+(n-50)*0.75;

  println(price(60));
}

