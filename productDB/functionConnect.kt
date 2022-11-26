package com.axis.productDB

import java.sql.DriverManager
import java.sql.Connection
class DBConnection{
    fun connect():Connection
    {
        val myUrl="jdbc:mysql://localhost:3306/kotlindb"
        val connection=DriverManager.getConnection(myUrl,"root","Sra1@goud")
        return connection
    }
}