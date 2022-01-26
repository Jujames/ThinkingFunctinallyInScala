/** Scan Left, Scan Right
 * Return the entire result list from
 * the scan operation
 *
 * Fold Left, Fold Right
 * Return only the 'last' element
 * of the result list
 * 2 PARAMETER GROUPS, 2 PAIRS OF ()
 * An initial value, and a function object
 * (0) => Initial value of 0
 * This will be used for the first iteration
 * SINGLE VALUE RETURNED, not a list
 * Fold functions return the last value from the scan result list*/
val someNumbers = List(10,20,30,40,50,60)
someNumbers.foldLeft(0)(_ - _) // Result -210

someNumbers.foldRight(0)(_ - _) // Result -30