/** Parameter default values */
def getCircleStats(PI:Double = 3.14, r:Double) = {
  def getCircleArea(r: Double) = PI * r * r
  def getCircleCircumference(r: Double) = 2 * PI * r
  (getCircleArea(r), getCircleCircumference(r))
}
getCircleStats(r=10)

/** Partially Applied Functions */
def compareStrings(s1:String,s2:String): Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {1}
}

def smartCompare(s1:String,s2:String, cmpFn:(String,String) => Int): Int = {
  cmpFn(s1,s2)
}

val defaultCompare = smartCompare(_:String,_:String,compareStrings)
defaultCompare("abc", "xyz")

/** Currying */
def curriedCompare(cmpFn:(String,String) => Int)
                  (s1:String,s2:String):Int = {
  cmpFn(s1,s2)
}
curriedCompare(compareStrings)("abc", "xyz")

val defaultCompare2 = curriedCompare(compareStrings)
(_:String,_:String)
defaultCompare2("abc", "xyz")