package KotlinTask25Nov

import java.util.Scanner
var age=fun(age:Int):String{
    if(age<18)
        return("Not Adult")
    else if(age>=18&&age<=50)
        return("you are an adult")
    else
        return("Senior Citizen")
}
fun main(){
    var scan=Scanner(System.`in`)
    println("enter the age:")
    var age=scan.nextInt()
    val result=age(age)
    println(result)
}