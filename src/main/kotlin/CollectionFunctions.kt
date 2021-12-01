fun main() {
    val x = listOf(12,34,56,78,90,627, 54,56,65324,65,62145)

    val y = x.reduce { y, vars -> y + vars }

    println("Have a Nice Day users its the first example regarding the reduce() $y")
    // Have a Nice Day users its the first example regarding the reduce() 128541

    val z = x.fold(2) { y, vars -> y + vars * 5}

    println("Thank you users for spending the time please try again $z")
    // Thank you users for spending the time please try again 642707

    val ab = listOf("First", "Welcome", "To", "My","Domain")

    println(ab.reduce { cd, vars1 -> cd + vars1 })
    // FirstWelcomeToMyDomain

    val ef = listOf("second", "Please", "Try", "Again","Have", "A", "Nice", "Day", "Users","123","456","789")

    println(ef.reduce { gh, vars2 -> gh + vars2 })
    // secondPleaseTryAgainHaveANiceDayUsers123456789
}