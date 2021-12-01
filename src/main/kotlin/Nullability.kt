fun main() {
    // Call nullability1
    nullability1()
    // Call nullability2
    nullability2()
}

fun nullability1() {
    var mustNotBeNull: String = "Hello"
//  mustNotBeNull = null

//  println(mustNotBeNull)
}

fun nullability2() {
    var possiblyNull:String? = "Hello"
    possiblyNull = null

    println(possiblyNull)
}
