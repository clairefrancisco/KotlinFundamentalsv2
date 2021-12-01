fun main() {
    // Call exception1
    exception1()
    // Call throwException
    throwException()
}

fun exception1() {
    try {
        val a = 0
//    var b = 7 / a

        val c = "A word"
        c.toInt()
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println("Exception occurred. To print stacktrace use $e")
    } finally {
        println("Finally. It's over")
    }
}

fun throwException() {
    try {
        println("Before exception")
        throw Exception("Something went wrong here")
        println("After exception")
    }
    catch(e: Exception){
        println(e)
    }
    finally{
        println("You can't ignore me")
    }
}