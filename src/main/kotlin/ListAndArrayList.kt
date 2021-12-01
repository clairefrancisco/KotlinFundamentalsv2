fun main() {
    // Call listAndArrayList1
    listAndArrayList1()
    // Call listAndArrayList2
    listAndArrayList2()
    // Call listAndArrayList3
    listAndArrayList3()
    // Call listAndArrayList4
    listAndArrayList4()
    // Call listAndArrayList5
    listAndArrayList5()
    // Call listAndArrayList6
    listAndArrayList6()
    // Call listAndArrayList7
    listAndArrayList7()
}

fun listAndArrayList1() {
    // creates empty arrayList using constructor
    val arrayList = ArrayList<String>()

    //adds String elements in the list
    arrayList.add("Grey")
    arrayList.add("Owl")

    println("Array list ---->")
    // Array list ---->

    // iterates the list and prints every element
    for(i in arrayList)
        println(i)

    // adds "For" at index 1
    arrayList.add( 1 , "For")

    println("Arraylist after insertion ---->")
    // Arraylist after insertion ---->

    // iterates the updated list and prints every element
    for(i in arrayList)
        println(i)
}

fun listAndArrayList2() {
    // creates empty arrayList using constructor
    val arrayList=ArrayList<String>()

    //adds String elements in the list
    arrayList.add("Grey")
    arrayList.add("For")
    arrayList.add("Owl")

    // creates new arrayList1
    val arrayList1 = ArrayList<String>()

    // Elements in arrayList1 -->
    println("Elements in arrayList1 -->")

    //adds all elements from arrayList to arraylist1
    arrayList1.addAll(arrayList)

    // iterates the list and prints every element
    for(i in arrayList1)
        println(i)
}

fun listAndArrayList3() {
    // creates empty arraylist using constructor
    val arrayList = ArrayList<Int>()

    // adds elements
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)
    arrayList.add(40)
    arrayList.add(50)

    // iterates through and prints the elements
    for(i in arrayList)
        print("$i ")

    println()

    println("Accessing the index 2 of arraylist: "+arrayList.get(3))
    // Accessing the index 2 of arraylist: 40
}

fun listAndArrayList4() {
    // creates empty arraylist using constructor
    val arrayList = ArrayList<String>()

    // adds elements
    arrayList.add("Grey")
    arrayList.add("for")
    arrayList.add("Owl:")
    arrayList.add("Portal")

    // iterates through and prints the elements
    for(i in arrayList)
        print("$i ")

    println()

    // sets the element at index 3 with new string
    arrayList[3] = "A Computer Science portal for students"

    // iterates through and prints the elements
    for(i in arrayList)
        print("$i ")
}

fun listAndArrayList5() {
    // creates empty arraylist using constructor
    val arrayList = ArrayList<String>()

    // adds elements
    arrayList.add("Grey")
    arrayList.add("for")
    arrayList.add("Owl")

    // iterates through and prints the elements
    for(i in arrayList)
        print("$i ")

    // next line
    println()

    println("The index of the element is: "+arrayList.indexOf("Grey"))
    // The index of the element is: 0
}

fun listAndArrayList6() {
    // creates empty arraylist using constructor
    val arrayList = ArrayList<String>()

    // adds elements
    arrayList.add("Grey")
    arrayList.add("for")
    arrayList.add("Owl")

    // removes "for" from the arraylist
    arrayList.remove("for")

    // iterates through and prints the elements
    for(i in arrayList)
        print("$i ")
}

fun listAndArrayList7() {
    // creates empty arraylist using constructor
    val arrayList = ArrayList<Int>()

    // adds elements
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)
    arrayList.add(40)
    arrayList.add(50)

    // iterates through and prints the elements
    for(i in arrayList)
        print("$i ")

    // removes all elements from the list
    arrayList.clear()

    // next line
    println()

    println("The size of arraylist after clearing all elements: "+arrayList.size)
    // The size of arraylist after clearing all the elements: 0
}