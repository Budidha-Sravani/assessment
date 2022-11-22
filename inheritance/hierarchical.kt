package inheritance

fun main(){
    var d=D()
    var b=B()
    d.display1()
    b.display2()
    d.display4()
}
class D:A(){
    fun display4(){
        println("i am son ")
    }
}

