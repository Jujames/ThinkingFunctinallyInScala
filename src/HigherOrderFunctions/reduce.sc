/** Reduce Left, Reduce Right
 * No initial value - first two list
 * elements as operands in first step
 *
 * JUST 1 PARAMETER GROUP, 1 PAIR OF ()
 * No initial value, only a function object
 * SINGLE VALUE RETURNED, NOT A LIST
 * Similar to fold, but different from scan */
val someNumbers = List(10,20,30,40,50,60)
someNumbers.reduceRight(_ - _) // result -30
/** 50 - 60 = -10
 * 40 - -10 = 50
 * 30 - 50 = -20
 * 20 - -20 = 40
 * 10 - 40 = -30 */

someNumbers.reduceLeft(_ - _) // -190
/** 10 - 20 = -10
 * -10 - 30 = -40
 * -40 - 40 = -80
 * -80 - 50 = -130
 * -130 - 60 = -190 */