package KotlinTask25Nov
import java.util.Scanner
fun main(){
    var accType:String
    var accNo:Int
    var balance:Double=1000.0
    var scan=Scanner(System.`in`)
    println("enter the acc number: ")
    accNo=scan.nextInt()
    println("enter the account Type:")
    accType=scan.next()

    var account=Account(accNo,balance,accType)
    account.rateOfInterest()
    println("enter your choice:  1.withdraw   2.deposite")
    var choice=scan.nextInt()
    if(choice==1)
    account.withdraw()
    else if(choice==2)
    account.deposite()
    else
        println("invalid choice")
    //account.rateOfInterest()
    account.getBalance()

}
class Account(var  accNo:Int,var balance:Double,var accType:String)
{

    var scan=Scanner(System.`in`)
    fun withdraw(){
        println("enter the amount to withdraw:")
        var amount=scan.nextInt()
        var res1=balance-amount
        balance=res1
        println("balance:$balance")
    }
    fun deposite(){
        println("enter the amount to deposite:")
        var amount=scan.nextInt()
        var res2=balance+amount
        balance=res2
        println("balance:$balance")
    }
       //var interestRate:Double
    fun rateOfInterest(){
        var interestRate:Double
        if(accType=="savings") {
            interestRate= balance*0.06
            println("interestRate:$interestRate")
            balance=balance+interestRate
        }
        else if(accType=="current") {
           interestRate=balance*0.10
            println("interestRate:$interestRate")
            balance=balance+interestRate
        }
           else {
            println("invalid account Type ")
        }
        }
    fun getBalance(){
        println("total balance=$balance")
    }
    }