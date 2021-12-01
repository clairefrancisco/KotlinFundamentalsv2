fun main() {
    // Call breakStatement
    breakStatement()
    // Call breakStatement
    labeledBreakStatement()
    // Call continueStatement
    continueStatement()
    // Call labeledContinueStatement
    labeledContinueStatement()
}

fun breakStatement() {
    // declares an Int variable
    var i = 0;

    // prints i until i is greater than or equal to 100
    while (i++ < 100) {
        println(i)
        // exits the loop when i is equal to 3
        if ( i == 3 ) {
            break
        }
    }
}

fun labeledBreakStatement() {
    // enters the loop first, then reenters every time it exits the innerLoop
    outerLoop@ for (i in 1..3) {
        // iterates through 1-3 every time it enters the outerLoop
        innerLoop@ for (j in 1..3) {
            println("i = $i and j = $j")
            // exits the loop if i is equal to 2
            if (i == 2) {
                break@outerLoop
            }
        }
    }
}

fun continueStatement() {
    // declares an Int variable
    var i = 0;

    // prints i until it's greater than 6 but skips 3
    while (i++ < 6) {
        if( i == 3 ){
            continue
        }
        println(i)
    }
}

fun labeledContinueStatement () {
    // enters the loop first, then reenters every time it exits the innerLoop
    outerLoop@ for (i in 1..3) {
        // iterates through 1-3 every time it enters the outerLoop
        innerLoop@ for (j in 1..3) {
            // checks if i is 2 then skips to 3
            if (i == 2) {
                continue@outerLoop
            }
            println("i = $i and j = $j")
        }
    }
}