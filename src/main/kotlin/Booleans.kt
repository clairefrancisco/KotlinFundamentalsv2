fun main() {
    // Call andOr
    andOr()
    // Call compareTo
    compareTo()
    // Call equals
    equals()
}

fun andOr() {
    var t = true;
    var f = false;

    // true AND true
    println("t.and(t): "+t.and(t));

    // true AND false
    println("t.and(f): "+t.and(f));

    // false AND true
    println("f.and(t): "+f.and(t));

    // false AND false
    println("f.and(f): "+f.and(f));

    // true OR true
    println("t.or(t): "+t.or(t));

    // true OR false
    println("t.or(f): "+t.or(f));

    // false OR true
    println("f.or(t): "+f.or(t));

    // false OR false
    println("f.or(f): "+f.or(f));

    // NOT true
    println("not(t): "+t.not());

    // NOT false
    println("not(f): "+f.not());
}

fun compareTo() {
    var t = true;
    var f = false;

    // true compareTo true
    println("t.compareTo(t): "+t.compareTo(t));

    // true compareTo false
    println("t.compareTo(f): "+t.compareTo(f));

    // false compareTo true
    println("f.compareTo(t): "+f.compareTo(t));

    // false compareTo false
    println("f.compareTo(f): "+f.compareTo(f));
}

fun equals() {
    var t = true;
    var f = false;

    // true equals true
    println("t.equals(t): "+ (t == t));

    // true equals false
    println("t.equals(f): "+ (t == f));

    // false equals true
    println("f.equals(t): "+ (f == t));

    // false equals false
    println("f.equals(f): "+ (f == f));
}
