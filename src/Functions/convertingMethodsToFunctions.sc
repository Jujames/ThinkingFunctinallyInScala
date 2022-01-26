val PI = 3.14
val r = 10
def getCircleArea(r:Double):Double = PI * r * r

/** Explicit way */
val calcCircleArea: (Double) => Double = getCircleArea
calcCircleArea(r)
/** Shorthand way */
val calcCircleArea2 = getCircleArea _

/** Cannot be done shorthand way with closures */
def getAreaClosure = {
  val PI = 3.14159
  val getArea = (radius:Double) => {
    PI * radius * radius
  }:Double
  getArea
}

val areaCalculator:(Double)=>Double = getAreaClosure
areaCalculator(r)