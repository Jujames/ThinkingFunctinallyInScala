** By-Name Parameters
  * Function parameters that auto-refresh each time
* they are referenced */
def sayHelloTo(name: String): String = {
  println(s"Hello $name")
  println(s"Yet again, hello! $name")
  name
}

def addGreeting(x: String): String = {
  println("Adding greeting")
  s"Respected Dear $x"
}

def sayHelloToByName(name: => String): String = {
  println(s"Hello $name")
  println(s"Yet again, hello! $name")
  name
}

sayHelloTo("Nic")
sayHelloToByName("Nic")

sayHelloTo(addGreeting("Nic"))
sayHelloToByName(addGreeting("Nic"))

/** Closures
 * Functions that carry around their environment with them
 * */
def getAreaClosure = {
  val PI = 3.14159
  val getArea = (radius:Double) => {
    PI * radius * radius
  }:Double
  getArea
}

val PI = 3.1
val r = 10
val areaCalculator:(Double)=>Double = getAreaClosure
areaCalculator(r)
/** ignores value of PI 3.1
 * and uses the one from the closure */