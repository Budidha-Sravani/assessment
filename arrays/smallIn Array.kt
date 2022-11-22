package arrays
import java.util.*
fun main(){
    var arr=arrayOf(22,66,999,11,4,555)
    var small=arr[0]
    for (i in arr){
        if(i<small){
            small=i
        }
    }
    print("smallest number in array:")
    print("$small")
    var sum=0
}