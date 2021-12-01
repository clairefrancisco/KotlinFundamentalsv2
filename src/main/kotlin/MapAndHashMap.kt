fun main() {
    val hashMap : HashMap<String, Int> = HashMap<String, Int> ()
    // Call mapAndHashMap1
    mapAndHashMap1(hashMap)
    // Call mapAndHashMap2
    mapAndHashMap2(hashMap)
    // Call mapAndHashMap3
    mapAndHashMap3(hashMap)
}

fun printHashMap(hashMap : HashMap<String, Int>){
    // checks if the hashmap is empty
    if(hashMap.isEmpty()){
        println("hashMap is empty")
    }else{
        println("hashMap : $hashMap")
    }
}

fun mapAndHashMap1(hashMap: HashMap<String, Int>) {
    // checks if the hashmap is empty
    printHashMap(hashMap)

    // adds elements to the hashMap
    hashMap["IronMan"] = 3000
    hashMap["Thor"] = 100
    hashMap["SpiderMan"] = 1100
    hashMap["NickFury"] = 1200
    hashMap["HawkEye"] = 1300

    // checks if the hashmap is empty
    printHashMap(hashMap)

    println("hashMap : $hashMap\n")
    // hashMap : {Thor=100, HawkEye=1300, NickFury=1200, IronMan=3000, SpiderMan=1100}

    // iterates through hashmap keys and prints them
    for(key in hashMap.keys){
        println("Element at key $key : ${hashMap[key]}")
    }

    // creates another hashmap object
    val secondHashMap : HashMap<String, Int> = HashMap<String, Int> (hashMap)

    println("\n" + "Second HashMap : ")
    // Second HashMap :

    // iterates through secondHashMap keys and prints them
    for(key in secondHashMap.keys){
        println("Element at key $key : ${secondHashMap.get(key)}")
    }

    // clears the first map
    hashMap.clear()

    // prints the updated map
    println("After Clearing : $hashMap")
    // After Clearing : {}
}

fun mapAndHashMap2(hashMap: HashMap<String, Int>) {
    // checks if the hashmap is empty
    printHashMap(hashMap)

    // adds elements to the hashMap
    hashMap["IronMan"] = 3000
    hashMap["Thor"] = 100
    hashMap["SpiderMan"] = 1100
    hashMap["NickFury"] = 1200

    // iterates through hashMap keys and prints them
    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }

    // returns and prints the size of the hashMap
    println("\n" + "hashMap.size : " + hashMap.size )

    // adds a new element to the hashMap
    hashMap["BlackWidow"] = 1000;

    // returns and prints the size of the hashMap
    println("hashMap.size : " + hashMap.size + "\n")

    // iterates through hashMap keys and prints them
    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
}

fun mapAndHashMap3(hashMap: HashMap<String, Int>) {
    // checks if the hashmap is empty
    printHashMap(hashMap)

    // adds elements to the hashMap
    hashMap["IronMan"] = 3000
    hashMap["Thor"] = 100
    hashMap["SpiderMan"] = 1100
    hashMap["Cap"] = 1200

    // iterates through hashMap keys and prints them
    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }

    println("\nhashMap[\"IronMan\"] : " + hashMap["IronMan"])
    // hashMap["IronMan"] : 3000

    // stores value 2000 to key Thor
    hashMap["Thor"] = 2000

    println("hashMap.get(\"Thor\") : " + hashMap.get("Thor") + "\n")
    // hashMap.get("Thor") : 2000

    // replaces value of key Cap
    hashMap.replace("Cap" , 999)

    println("hashMap.replace(\"Cap\" , 999)" + " hashMap.replace(\"Thor\" , 2000)):")
    // hashMap.replace("Cap", 999) hashMap.replace("Thor", 2000)):

    // iterates through hashMap keys and prints them
    for(key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
}