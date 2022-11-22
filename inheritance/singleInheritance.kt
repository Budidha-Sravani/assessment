package inheritance

fun main(){
    var b=B()
    b.display2()
}
open class A{
    fun display1(){
        println("i am parent")
    }
}
open class B:A(){
    fun display2(){
        println("i am daughter")
    }
}