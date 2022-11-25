package KotlinTask25Nov

fun main(){
    var num1=0
    var num2=0
    for(i in 1..100){
        if(i%3==0){
            num1++
        }
        if(i%5==0){
            num2++
        }
    }
    println("count of numbers which are divisible by 3 :$num1")
    println("count of numbers which are divisible by 5 :$num2")
}