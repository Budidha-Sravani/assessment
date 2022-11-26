package com.axis.productDB
//import DBConnection
import java.sql.DriverManager
fun main(){
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("connection established successfully!!!")
    val stmt=connection.createStatement()
    stmt.execute("create table Product(id int,name varchar(50),price int,model int);")
    println("Table Created!!!")
}
