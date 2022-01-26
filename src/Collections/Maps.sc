val stateCodes = Map(
  "California" -> "CA",
  "New York" -> "NY",
  ("Vermont", "VT")
)

stateCodes("Vermont")
stateCodes.contains("California")
stateCodes.contains("Georgia")
stateCodes.foreach((p: (String, String)) => println(p._1 + "=" + p._2))

val states = List("California", "New York", "Vermont")
val codes = List("CA", "NY", "VT")

val stateCodes2 = (states zip codes).toMap
val states2 = stateCodes.keySet.toList

val codes2 = stateCodes.values.toList