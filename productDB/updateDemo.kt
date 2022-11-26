package com.axis.productDB

import java.sql.DriverManager
fun main(){
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")
    //updating data
    val stmt=connection.createStatement()
    val update_res=connection.createStatement().executeUpdate("update Product set name='Phone' where id=2")
    if(update_res>0) {
        println("successfully update recored in Product db !!!")
        println("$update_res updated")
    }else{
        println("Update Not successful")
    }
}