val someNumbers = collection.mutable.Buffer(10,20,30,40,50)

val stateCodes = collection.mutable.Map("California" -> "CA", ("Vermont", "VT"))

val listBuilder = List.newBuilder[Int]
someNumbers.foreach(listBuilder+=_)
/** listBuilder+=_ uses overloaded += operator
 * This will add each element of someNumbers to the listBuilder */
val reconstructedList = listBuilder.result

val daysOfWeek = Array("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
daysOfWeek(0)
daysOfWeek(0) = "Manic Monday"
daysOfWeek