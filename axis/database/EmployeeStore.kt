package com.axis.database
import com.axis.modal.Employee

class EmployeeStore{
    var employees=mutableListOf<Employee>()
    init{
        employees.add(Employee(101,"Sravani",1200,"Hr"))
        employees.add(Employee(102,"ruchi",1500,"Tr"))
        employees.add(Employee(103,"nikki",1600,"product manager"))
        employees.add(Employee(104,"keerthana",1400,"dataAnalyst" ))
    }
    fun data():MutableList<Employee>{
        return employees
    }
}
