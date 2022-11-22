import java.util.Scanner
fun main()
{
    var reader=Scanner(System.`in`)
    println("enter a number:")
    var number:Int=reader.nextInt()
    var fact=1
    for(i in 1..number) {
        fact = fact * i
    }
        println("factorial of $number is $fact")
}