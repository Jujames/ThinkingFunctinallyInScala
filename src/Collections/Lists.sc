val weekDays2 = "Mon" :: "Tue" :: "Wed" :: "Thu" :: "Fri" :: Nil
val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")
val weekendDays = "Sat" :: "Sun" :: Nil
val weekendDays2 = List("Sat", "Sun")

val days = weekDays ::: weekendDays
val days2 = weekDays2 ++ weekendDays2

val daysAgain = List(weekDays, weekendDays).flatten

val dayIndices = List(1,2,3,4,5,6,7)
dayIndices zip dayIndices
days zip dayIndices

weekDays.head
weekDays.tail
weekDays.size
weekDays.reverse
weekDays(1)
weekDays.contains("Mon")
for (c <- weekDays) println(c)
weekDays forall (_ != "monday")
daysAgain endsWith weekendDays
daysAgain startsWith weekDays