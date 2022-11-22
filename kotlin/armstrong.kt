import java.util.Scanner
fun main()
{
    var reader=Scanner(System.`in`)
    print("enetr a number:")
    var number:Int=reader.nextInt()
    var sum=0
    var temp=number
    while(number>0){
        var rem=number%10
        sum=sum+(rem*rem*rem)
        number=number/10
    }
    if(temp==sum)
        println("$temp is an armstrong number")
    else
        print("$temp is not an armstrong number")
}