val someNumbers = List(10,20,30,40,50,60)
/** 2 PARAMETER GROUPS, 2 PAIRS OF ()
 * An initial value, and a function object */
someNumbers.scanRight(0)(_ - _)
/** (_-_) => (operand1 - operand2)
 *Two placeholders, both will be interpreted by scanRight
 * (0) => Initial value of 0
 * This will be used for the first iteration
 * RESULT - starting from right working to left
 * 0 (intitial value)
 * 60 - 0 = 60
 * 50 - 60 = -10
 * 40 - -10 = 50
 * 30 - 50 = -20
 * 20 - -20 = 40
 * 10 - 40 = -30      OR
 * List(-30,40,-20,50,-10,60,0) */