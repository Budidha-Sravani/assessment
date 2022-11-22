import java.util.Scanner
fun main() {
    var reader = Scanner(System.`in`)
    println("enter the number of elements:")
    var number: Int = reader.nextInt()
    var num1 = 0
    var num2 = 1
    var num3 = num1 + num2
    println("list of first $number terms")
    for (i in 3..number) {
        println("$num1 ")
        num1 = num2
        num2 = num3
        num3 = num2 + num1
    }
}