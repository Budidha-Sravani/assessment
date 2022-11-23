package collections

fun main(){
    var javabatch=mutableListOf("anil","gopal","ankit","manish")
    var kotlinbatch=mutableListOf("ankit","kumar","manish","rahul")
    println("javabatch $javabatch")
    println("kotlinbatch $kotlinbatch")
    javabatch.addAll(kotlinbatch)
    println("after combining $javabatch")
    javabatch.removeAll(kotlinbatch)
    println("after removing duplicates $javabatch")
    javabatch.retainAll(kotlinbatch)
    javabatch.sort()
    kotlinbatch.sort()
    println("after sorting javabatch $javabatch")
    println("after sorting kotlinbatch $kotlinbatch")
}