//fun main(){
//    var myName = "Claire"  //mutable
//    val mySurname = "Francisco" //immutable
//    var myAge = 0
//
//    myAge++
//    println(myName)
//    println(mySurname)
//    println(myAge)
//}

fun main() {
    // Call string concatenation
    stringConcatenation()
    // Call string literals
    stringTemplates()
    // Call string length literals
    stringLengthTemplate()
}

fun stringConcatenation() {
    val me = "Are you " + 100
    println("$me% Ready?")
}

fun stringTemplates() {
    val me = "I'm more than Ready!"
    println("Yes, $me")
}

fun stringLengthTemplate() {
    val aToZ = "abcdefghijklmnopqrstuvwxyz"
    println("There are ${aToZ.length} letters in the alphabet.")
}