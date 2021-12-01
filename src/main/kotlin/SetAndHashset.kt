fun main() {
    // Call setAndHashSet1
    setAndHashSet1()
    // Call setAndHashSet2
    setAndHashSet2()
    // Call setAndHashSet3
    setAndHashSet3()
    // Call setAndHashSet4
    setAndHashSet4()
}

fun setAndHashSet1() {
    // declares a hashset of integers
    val setA = hashSetOf(1,2,3,3)

    println(setA)
    // [1, 2, 3]

    // declares a hashset of strings
    val setB = hashSetOf("Set","and","HashSet")

    println(setB)
    // [Set, and, HashSet]
}

fun setAndHashSet2() {
    // declares a hashset of integers
    val setA = hashSetOf<Int>();

    println(setA)
    // {}

    // adds elements
    setA.add(1)
    setA.add(2)

    // creates another set
    val newSet = setOf(4,5,6)

    // adds newSet elements to setA
    setA.addAll(newSet)

    println(setA)
    // [1, 2, 4, 5, 6]

    // removes element 2 from the set
    setA.remove(2)

    println(setA)
    // [1, 4, 5, 6]
}

fun setAndHashSet3() {
    // declares a hashset of integers
    val setA = hashSetOf(1,2,3,5);

    // traverses in a set using a for loop and prints each item
    for(item in setA)
        println(item)
}

fun setAndHashSet4() {
    // declares a hashset of strings
    val captains = hashSetOf("Kohli","Smith","Root","Malinga","Rohit","Dhawan")

    println("The element at index 3 is: " + captains.elementAt(3))
    // The element at index 3 is: Smith

    println("The index of element is: " + captains.indexOf("Smith"))
    // The index of element is: 3

    println("The last index of element is: " + captains.lastIndexOf("Rohit"))
    // The last index of element is: 0
}

fun setAndHashSet5() {
    // declares a hashset of integers and strings
    val captains = hashSetOf(1,2,3,4,"Kohli","Smith", "Root","Malinga","Rohit","Dhawan")

    // stores "Rohit" to a variable
    var name = "Rohit"

    println("The set contains the element $name or not?" + " " + captains.contains(name))
    // The set contains the element Rohit or not? true

    println("The set contains the given elements or not?" + " " + captains.containsAll(setOf(1,3,"Dawn","Warner")))
    // The set contains the given elements or not? false
}