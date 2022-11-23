package com.axis.app

import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main(){
    var employeeService=EmployeeService()
//Adding Employee
    var employee1=Employee(105,"pavi",1200,"MR")
    var employee2=Employee(106,"akki",1300,"Designer")
    employeeService.addNewEmployee(employee1)
    employeeService.addNewEmployee(employee2)
    employeeService.viewAllEmployees()

}