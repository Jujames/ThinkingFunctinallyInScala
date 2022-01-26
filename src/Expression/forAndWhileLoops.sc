/** Statement for-loop */
val daysOfWeekList = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
for (day <- daysOfWeekList)
{
  day match {
    case "Mon" => println("Manic Monday")
    case otherDay => println(otherDay)
  }
}

/** Expression for-loop */
val x = for(day <- daysOfWeekList) yield
{
  day match {
    case "Mon" => "Manic Monday"
    case otherDay => otherDay
  }
}

/** Value binding
 * "day" is bound as the value for each day of the list
 * and is printed (foreach) */
for(day <- daysOfWeekList) {
  println(day)
}

/** Range */
for(i <- 0 to daysOfWeekList.size - 1) {
  println(daysOfWeekList(i))
}

/** OR */
for(i <- 0 until daysOfWeekList.size) {
  println(daysOfWeekList(i))
}

/** Pattern Guard */
for(day <- daysOfWeekList if day == "Mon") {
  println("Manic Monday")
}

/** Nested for-loop */
for {i <- 0 until 7
     j <- daysOfWeekList}
{
  println(s"$i,$j")
}

/** While Loops
 * While loops are statements - no value returned
 * Loop variable needs to be mutable
 * Value binding needs to be explicit
 * Cannot be chained or composed
 * Infrequently used due to clunky syntax */
var z = 0;
while(z < daysOfWeekList.size) {
  println(daysOfWeekList(z))
  z+=1
}