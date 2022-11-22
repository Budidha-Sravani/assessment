package arrays

import java.util.Scanner
import java.util.*
fun main(){
    var scan=Scanner(System.`in`)
    print("enter the size of an array:")
    var size=scan.nextInt()
    println("enter the elements into an array:")
    var arr=Array(size,{0})
    for(i in 0..size-1)
        arr.set(i,scan.nextInt())
    var large=arr[0]
    for (i in arr){
        if(i>large){
            large=i
        }
    }
    println("largest element in the array:$large")
    //second largest number in array
    for(i in 0..size-1){
        for(j in i+1..size-1){
            if(arr[i]<arr[j]){
                var temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
            }
        }
    }
    println("second largest element of array :${arr[1]}")
    //sum of elements in array
    var sum=0
    for(i in arr) {
        sum = sum + i
    }
    println("sum of elements in the array:$sum")
}