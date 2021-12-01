fun main() {
    // Call ifConditional1
    ifConditional1()
    // Call ifConditional2
    ifConditional2()
    // Call ifConditional3
    ifConditional3()
    // Call ifConditional4
    ifConditional4()
}

fun ifConditional1() {
    // creates an Int variable
    val age:Int = 10

    // checks if age is above 18
    if (age > 18) {
        print("Adult")
    } else {
        print("Minor")
    }
}

fun ifConditional2() {
    // creates an Int variable
    val age:Int = 10

    // checks if age is above 18 and stores boolean value to a variable
    val result = if (age > 18) "Adult" else "Minor"
    println(result)
}

fun ifConditional3() {
    // creates an Int variable
    val age:Int = 13

    // checks if age is above 19
    val result = if (age > 19) {
        "Adult"
    } else if (age in 13..19){
        "Teen"
    } else {
        "Minor"
    }

    print("The value of result: ")
    // The value of result:
    println(result)
    // Teen
}

fun ifConditional4() {
    // creates an Int variable
    val age:Int = 20

    // checks if age is above 12 and stores boolean value to a variable
    val result = if (age > 12) {
        if (age in 13..19){
            "Teen"
        } else {
            "Adult"
        }
    } else {
        "Minor"
    }

    print("The value of result: ")
    // The value of result:
    println(result)
    // Adult
}