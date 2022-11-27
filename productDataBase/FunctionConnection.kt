package com.axis.productDataBase

import java.sql.Connection
import java.sql.DriverManager
class DBConnection {
    fun connect(): Connection {
        val myUrl = "jdbc:mysql://localhost:3306/kotlindb"
        val connection = DriverManager.getConnection(myUrl, "root", "Sra1@goud")
        return connection
    }
}