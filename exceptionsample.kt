import java.util.InputMismatchException
import java.lang.ArithmeticException
import java.util.Scanner
fun maain() {
    var scan = Scanner(System.`in`)
    try {
        println("enter the 1st number:")
        var num1 = scan.nextInt()
        println("enter the 2nd number:")
        var num2 = scan.nextInt()
        var result = num1 / num2
    } catch (e: ArithmeticException) {
        println("do not enter Zero")
    } catch (e: InputMismatchException) {
        println("enter only numbers")
    }
}



