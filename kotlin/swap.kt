fun main()
{
    //swap with temp variable
    var a=10
    var b=15
    var temp:Int
    println("before swapping a=$a ,b=$b")
    temp=a
    a=b
    b=temp
    println("after swapping a is $a,b is $b")
    //swap without temp variable
    var x=20
    var y=25
    println("before swapping x=$x, y=$y")
    x=x+y
    y=x-y
    x=x-y
    println("after swapping x is $x,y is $y")
}