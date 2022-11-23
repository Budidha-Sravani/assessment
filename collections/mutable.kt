package collections

fun main() {
    var marks = mutableListOf<Int>(20,30,40,20)
    println(marks)
    println()
    marks.add(50)
    marks.add(34)
    println(marks)
    println("size  ${marks.size}")
    println("contains 20  ${marks.contains(20)}")
    println("contains 200 ${marks.contains(200)}")

}