val radius = 10.0
def getCircleStats(r:Double) = {
  val PI = 3.14
  def getCircleArea(r: Double) = PI * r * r
  def getCircleCircumference(r: Double) = 2 * PI * r
  (getCircleArea(r), getCircleCircumference(r))
}

getCircleStats(10)

def compareStringsAscending(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 > s2) 1
  else {-1}
}

compareStringsAscending("abc", "xyz")
compareStringsAscending("xyz", "abc")
compareStringsAscending("abc", "abc")

def compareStringsDescending(s1: String, s2: String): Int = {
  if(s1 == s2) 0
  else if (s1 > s2) -1
  else {1}
}

compareStringsDescending("abc", "xyz")
compareStringsDescending("xyz", "abc")
compareStringsDescending("abc", "abc")

def smartCompare(s1:String, s2:String, cmpFn:(String,String) => Int):Int = {
  cmpFn(s1,s2)
}

smartCompare("abc", "xyz", compareStringsAscending)
smartCompare("abc", "xyz", compareStringsDescending)

def getComparator(reverse: Boolean):(String, String) => Int = {
  if (reverse == true) compareStringsDescending
  else compareStringsAscending
}

val reverseComparatorObject = getComparator(true)
reverseComparatorObject("abc", "xyz")

val comparatorObject = getComparator(false)
comparatorObject("abc", "xyz")