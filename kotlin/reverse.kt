import java.util.Scanner
fun main()
{
    var reader=Scanner(System.`in`)
    print("enter a number:")
    var number:Int =reader.nextInt()
    var reverse=0
    while(number!=0){
        var remainder=number%10
        reverse=reverse*10+remainder
        number=number/10
    }
    print("reverse of a $number is $reverse")
}