package Oops
import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the num1: ")
    var num1=scan.nextInt()
    println("Enter the num2: ")
    var num2=scan.nextInt()
    var cal=Calculation(num1,num2)
    println("Select the option to do Calculation:")
    println("1.Add 2.Sub 3.Mul 4.Div")
    var opt=scan.nextInt()
    if (opt==1){
        println(cal.add())
    }
    else if(opt==2){
        println(cal.sub())
    }
    else if(opt==3){
        println(cal.mul())
    }
    else if(opt==4){
        println(cal.div())
    }
    else{
        println("Invalid Input")
    }
}
class Calculation(num1:Int,num2:Int){
    var num1:Int=num1
    var num2:Int=num2
    var add:Int=0
    var sub:Int=0
    var mul:Int=0
    var div:Int=0
    fun add():Int
    {
       return num1+num2
    }
    fun sub():Int{
        return num1-num2
    }
    fun mul():Int{
        return num1*num2
    }
    fun div():Int{
        return num1/num2
    }
}