package collections

fun main(){
    var fruits=mutableListOf("apple","mango","banana")
    println(fruits)
    fruits.add("orange")
    fruits.add("grapes")
    println(fruits)
    println("size ${fruits.size}")
    println("contains pineapple  ${fruits.contains("pineapple")}")
    println("contains apple ${fruits.contains("apple")}")

}