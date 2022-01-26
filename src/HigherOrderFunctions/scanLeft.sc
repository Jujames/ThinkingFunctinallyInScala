val someNumbers = List(10,20,30,40,50,60)
someNumbers.scanLeft(0)(_ - _)
/** 0
 * 0 - 10 = -10
 * -10 - 20 = -30
 * -30 - 30 = -60
 * -60 - 40 = -100
 * -100 - 50 = -150
 * -150 - 60 = -210
 * 2 PARAMETER GROUPS, 2 PAIRS OF ()
 * An initial value, and a function object
 * Two placeholders, both will be interpreted by scanRight
 * (0) => Initial value of 0
 * This will be used for the first iteration*/