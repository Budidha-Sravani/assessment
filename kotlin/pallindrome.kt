import java.util.Scanner
fun main()
{
    var reader=Scanner(System.`in`)
    println("enter a number")
    var number:Int=reader.nextInt()
    var sum=0
    var temp=number
    while(number>0){
        var rem=number%10
        sum=(sum*10)+rem
        number=number/10
    }
    if(temp==sum)
        println("$temp is palindrome")
    else
        println("$temp is not a palindrome")
}