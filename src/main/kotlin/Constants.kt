//const val PI_VALUE = 3.14

//fun main(){
//    print(PI_VALUE * 13)
//
//}

//fun main(args: Array<String>) {
//    print("Write anything here: ")
//
//    val enteredString = readLine()
//    println("You have entered this: $enteredString")
//
////  converting into integer
////    val number = Integer.valueOf(readLine())
////    println("The entered number is: $number")
//}
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun main() {
    print("What is your name? ")
     val yourName = readLine()

    print("What is your birthdate? (YYYY-MM-DD")
    val yourBirthday = readLine()

//COMPLEX USING LIBRARY
    val yourAge = LocalDate.parse(yourBirthday).until(LocalDate.now())

//    var yourAgeYear = current.year-date.year
//    var yourAgeMonth = current.month-date.month

//SIMPLEST
//    val yourBirthday = Integer.valueOf(readLine())
//    val yourAge = 2021-yourBirthday

    println("Your name is: $yourName")
    println("Your birthdate is: $yourBirthday")
    println("Your age is: ${yourAge.years} years, ${yourAge.months} months, ${yourAge.days} days old.")


}

//REMOVE FIRST AND LAST CHAR IN A STRING
//fun main(){
//    val sampleText = "eloquent"
//    var newText = sampleText.drop(1).dropLast(1)
//     println(newText)
//}


//fun multiply(x: Double, y: Double): Double { return x * y }

