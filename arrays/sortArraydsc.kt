package arrays

import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("enter the size of an array:")
    var size=scan.nextInt()
    print("enter the elements into an array:")
    var ele=Array(size,{0} )
    for(i in 0..size-1)
        ele.set(i,scan.nextInt())
    for(i in 0..size-1){
        for(j in 0..size-1){
            if(ele[i]<ele[j]){
                var temp=ele[i]
                ele[i]=ele[j]
                ele[j]=temp
            }
        }
    }
    print("Descending order of array:")
    for(i in ele)
        print("$i")
}