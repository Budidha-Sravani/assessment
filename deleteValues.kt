package com.axis.productDB

import java.sql.DriverManager
fun main(){
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")
    //updating data
    val stmt=connection.createStatement()
    val delete_res=connection.createStatement().executeUpdate("delete from Product where id=1")
    if(delete_res>0) {
        println("successfully deleted recored in Product db !!!")
        println("$delete_res deletion")
    }else{
        println("Deletion Not successful")
    }
}