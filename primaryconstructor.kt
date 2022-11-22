package Oops

fun main(){
    var employee=Employee_1(2,"sachin")
    employee.displayEmployeeInfo()
    var employee2=Employee_1(4,"developer")
    employee2.displayEmployeeInfo()
}
class Employee_1(id:Int=1,name:String="",dept:String="bench")
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    fun displayEmployeeInfo(){
        println("$id $name $dept")
    }

}

/*package oops
fun main(args: Array<String>) {
    var employee=Employee(2,"sachin")
     employee.displayEmployeeInfo()
    var employee2=Employee(4, dept = "developer")
    employee2.displayEmployeeInfo()
}
class Employee(id:Int=1,name:String="",dept:String="bench")
{
         var id:Int=id
         var name:String=name
         var dept:String=dept
    fun displayEmployeeInfo()
    {
        println("$id $name $dept")
    }
}*/