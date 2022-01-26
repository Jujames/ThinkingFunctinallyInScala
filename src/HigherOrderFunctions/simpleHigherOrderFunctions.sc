/** Map, foreach, filter
 * Act on one element at a time
 *
 * Scan, fold, reduce
 * Act on multiple elements at a time */
val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")
weekDays.foreach(println(_))
/** "println(_)" PROCEDURES
 * do not have a return value
 * PROCEDURE OBJECTS contain procedures like function objects contain functions */
/** FOREACH does not have a return value
 * If a function with a return value is specified,
 * THE RETURN VALUE IS IGNORED */
/** foreach is a statement, MAP IS AN EXPRESSION
 * map returns a list of return values from the function object */
weekDays.map(_ == "Mon")
val isManicMonday = (x:String) => {x == "Mon"}:Boolean
weekDays.map(isManicMonday)

/** FILTER elements on a condition
 * filter returns a
 * LIST OF ELEMENTS THAT RETURN TRUE FROM THE FUNCTION OBJECT */
weekDays.filter(isManicMonday)

/** PARTITION base on a condition
 * RETURNS 2 LISTS - elements that return true,
 * and those that return false */
weekDays.partition(isManicMonday)

/** SORTbY a sorting criterion
 * RETURNS A NEW LIST - original list is unchanged */
weekDays.sortBy(_(0))