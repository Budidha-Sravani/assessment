package com.axis.productDB
//import DBConnection
import java.sql.DriverManager
//data class User(val id:Int,val name:String,val price:Int,val model:Int)
fun main(){
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established successfully!!!")
    val stmt=connection.createStatement()
    //inserting data
    val res=connection.createStatement().executeUpdate("insert into Product values(7,'ScreenGaurd',4000,2022)")
    if(res>0) {
        println("successfully inserted record into Product db !!!")
    }else{
        println("Insert Not successful!!!")
    }
}