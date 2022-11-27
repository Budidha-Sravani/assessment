package com.axis.productDataBase.utility

import com.axis.productDataBase.DBConnection
import com.axis.productDataBase.modal.ProductModal
class ProductUtility
{
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    fun insert(product:ProductModal):Int {
        val prepareStmt = connection.prepareStatement("insert into product values(?,?,?,?)")
        prepareStmt.setInt(1, product.id)
        prepareStmt.setString(2, product.name)
        prepareStmt.setInt(3, product.price)
        prepareStmt.setInt(4, product.modal)
        val rows = prepareStmt.executeUpdate()
        return rows
    }
    fun viewProduct(){
        var products=mutableListOf<ProductModal>()
        val query=connection.prepareStatement("select * from Product")
        val result=query.executeQuery()
        while(result.next()){
            val id=result.getInt("id")
            val name=result.getString("name")
            val price=result.getInt("price")
            val modal=result.getInt("modal")
            products.add(ProductModal(id,name,price,modal))

        }
        for(product in products){
            println(product)
        }
    }
    fun update(id:Int,name:String):Int{
        var prepareStmt=connection.prepareStatement("update Product set name=? where id=?")
        prepareStmt.setString(1,name)
        prepareStmt.setInt(2,id)
        var rows=prepareStmt.executeUpdate()
        return rows
    }
    fun delete(id:Int):Int{
        val prepareStmt=connection.prepareStatement("delete from Product where id=?")
        prepareStmt.setInt(1,id)
        var rows=prepareStmt.executeUpdate()
        return rows
    }
}
