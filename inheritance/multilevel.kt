package inheritance
import inheritance.A
import inheritance.B
fun main(){
var a=A()
var b=B()
var c=C()
c.display3()
}
class C:B(){
    fun display3(){
        println("i am grand daughter")
    }
}