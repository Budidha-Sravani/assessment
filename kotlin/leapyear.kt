
import java.util.Scanner
fun main(args:Array<String>)
{
    var reader=Scanner(System.`in`)
    println("enter year:")
    var year:Int=reader.nextInt()
    if((year % 4==0)||((year%100==0)&&(year%400==0)))
    {
        println("$year is leap year")
    }
        else
        {
            println("$year is not leap year")
        }
}
