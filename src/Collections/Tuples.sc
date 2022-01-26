val personInfo = ("Nic", "James", 26, 'M')
val genderPair = "Nic" -> "M"

personInfo.productIterator.foreach{ i => println("Value = " + i)}

val (firstName, lastName, age, gender) = personInfo

def printPersonGender(name: String, gender: String) = println(s"Name:$name M/F:$gender")
(printPersonGender _).tupled(genderPair)

personInfo.productArity