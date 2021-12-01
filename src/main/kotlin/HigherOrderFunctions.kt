import kotlin.concurrent.thread

fun main() {
    // Call hof1
    hof1()
    // Call hof2
    hof2()
    // Call hof3
    hof3()
}

// HOF 1
fun rollDice1(
    range: IntRange,
    time: Int,
    callback: (result: Int) -> Unit
) {
    for (i in 0 until time) {
        val result = range.random()

        callback(result)
    }
}

fun hof1() {
    rollDice1(1..6, 3) { result ->
        println(result)
    }

    rollDice1(1..6, 3) {
        println(it)
    }
}

// HOF 2
fun rollDice2(callback: ((result: Int) -> Unit)? = null) {
    callback?.invoke((1..6).random())
}

fun hof2() {
    rollDice2 {
        println(it)
    }
}

// HOF 3
fun rollDice3(callback: ((result: Int) -> Unit)? = null) {
    println("Roll Dice Started")
    // Roll Dice Started

    thread {
        // mimicking a heavy operation by just putting a Thread.sleep

        Thread.sleep(5000)

        // function was already finished but after 5 seconds
        // we will get a callback at the trailing lambda

        callback?.invoke((1..6).random())
    }
    println("Roll Dice Ended")
    // Roll Dice Ended
}

fun hof3() {
    rollDice3 {
        println(it)
    }
}