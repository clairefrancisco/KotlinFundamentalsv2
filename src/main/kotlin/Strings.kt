fun main(){

//    val myMessage = "Happy Birthday! Justin!"
//    val anotherMessage = "Happy Birthday! Macki!"
//    println(myMessage)
//    println(myMessage.get(0))
//    println(myMessage.length)
//    println(myMessage.substring(16,22))
//    println(myMessage.compareTo(anotherMessage))
//    println(myMessage.plus(anotherMessage))
//    println(myMessage.subSequence(16,22))
//    println(myMessage.contains("Justin"))
//    println(myMessage.drop(1))
//    println(myMessage.dropLast(1))
//    println(myMessage.toUpperCase())
//    println(myMessage.toLowerCase())
//    println(myMessage.reversed())
//    println(myMessage.random())

//    val givenName = "Claire"
//    val surName = "Francisco"
//    val middleName = "Cordero"
//    val myAge = 21

//    println("My full name is $givenName ${middleName.get(0)} $surName")
//    println("My full name is $givenName ${middleName.first()} $surName")
//    println("My age 10 years from now is ${myAge + 10} ")

    val nickName = "clara"
    val amount = 100
    val product = 10
    val nickTwoName = "clara marie"

//    for (c in nickTwoName.toCharArray()) {
//        when (c) {
//            'a', 'e', 'i', 'o', 'u' ->   println("${nickName.replace(c,'!')}")
//        }
//    }

    val words = nickTwoName.split(" ").toMutableList()
    var newNickname = ""

    for(word in words){
        newNickname += word.capitalize() +" "
    }

    newNickname = newNickname.trim()

    println("Hey! ${newNickname} You need to pay ${amount*product} for $product products with a price of $amount each")
}