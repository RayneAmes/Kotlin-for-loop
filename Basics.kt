package com.example.kotlinbasics


fun main() {
    // Immutable list - you cannot add item after initialization
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    // Mutable list - you can add items or modifies
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // adding item to lists
    shoppingList.add("Mother board")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090",)
    shoppingList.removeAt(1)
    shoppingList.add(1, "RAM")
    shoppingList[2] = ("Graphics Card AMD Radeon RX 7900")
    shoppingList.set(1, "RAM")

    val hasHarm = shoppingList.contains("RAM")
    if (hasHarm) {
        println("Has RAM")
    }   else {
        println("You don't have RAM in the lists")
    }

    //println(shoppingList)

    for (item in shoppingList)  {
        println(item)
        if (item == "ROM") {
            break
        }
    }












}






/*

fun askDetails () {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    //makeCoffee(sugarCountInt, name)
}


fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if(coffeeDetails.sugarCount == 1) {
        println("Coffee with a 1 spoon of sugar for ${coffeeDetails.name}" +
                " with cream amount of ${coffeeDetails.creamAmount} percent")
    } else if (coffeeDetails.sugarCount == 0 || coffeeDetails.sugarCount == -1) {
        println("Coffee without sugar for ${coffeeDetails.name}" +
                "with cream amount of ${coffeeDetails.creamAmount} percent")
    }
    else {
        println("Coffee with ${coffeeDetails.sugarCount}" +
                "spoons of sugar for ${coffeeDetails.name}" +
                "with cream amount of ${coffeeDetails.creamAmount} percent")
    }


}

*/

