package collections

class Employee(id:Int,name:String,dept:String,sal:Int,age:Int){
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var sal:Int=sal
    var age:Int=age
}
fun main(){
    var employee=mutableListOf<Employee>()
    employee.add(Employee(101,"empA","dataAnalyst",50000,23))
    employee.add(Employee(102,"empB","finance",40000,23))
    employee.add(Employee(103,"empC","marketing",40000,23))
    for(Employee in employee){
        println("${Employee.id} ${Employee.name} ${Employee.dept} ${Employee.sal} ${Employee.age} ")
    }
}