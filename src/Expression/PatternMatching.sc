val dayOfWeek = "Friday"

/** Value binding */
val typeOfDay = dayOfWeek match {
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case someOtherDay => {
    println(s"Some other day - neither Sunday nor Monday," +
      s"its $someOtherDay")
    someOtherDay
  }
}

val dayOfWeek2 = "Saturday"
val typeOfDay2 = dayOfWeek2 match {
  case "Monday" => "Manic Monday"
  case "Sunday" | "Saturday" => "Lazy weekend"
  case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other workday"
}

val typeOfDay3 = dayOfWeek match {
  case "Monday" => "Manic Monday"
  case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other workday"
  case someOtherDay if someOtherDay == "Sunday" => "Sleepy Sunday"
  case someOtherDay if someOtherDay == "Saturday" => "Sizzing Saturday"
  case _ => {
    val errorString = s"Some other day - neither Sunday nor Monday," +
      s"its $dayOfWeek"
    dayOfWeek
  }
}