package com.axis.utility

import com.axis.DBConnection
import com.axis.modal.BookModal
class BookStoreUtility
{
    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    fun addBook(book:BookModal):Int {
        val prepareStmt = connection.prepareStatement("insert into book values(?,?,?,?,?)")
        prepareStmt.setString(1, book.bookID)
        prepareStmt.setString(2, book.title)
        prepareStmt.setString(3, book.author)
        prepareStmt.setString(4, book.category)
        prepareStmt.setFloat(5, book.price)
        val result = prepareStmt.executeUpdate()
        return result
    }
    fun displayAll(){
        var books=mutableListOf<BookModal>()
        val query=connection.prepareStatement("select * from book")
        val result=query.executeQuery()
        while(result.next()){
            val bookID=result.getString("bookID")
            val title=result.getString("title")
            val author=result.getString("author")
            val category=result.getString("category")
            val price=result.getFloat("price")
            books.add(BookModal(bookID,title,author,category,price))
        }
        for(book in books){
            println(book)
        }
        fun updateBook(bookID:String,updateValue:String):Int{
            val prepareStmt = connection.prepareStatement("update book set bookID=? where bookID=?")
            prepareStmt.setString(1,bookID)
            prepareStmt.setString(2,updateValue)
            val result = prepareStmt.executeUpdate()
            return result
        }

        fun displaySpecificBook(bookID:String):Int{
            val prepareStmt = connection.prepareStatement("select * from book where bookID=?")
            prepareStmt.setString(1,bookID)
            val result = prepareStmt.executeUpdate()
            return result
        }
        fun searchByTitle(title:String):Int{
            val prepareStmt = connection.prepareStatement("select * from book where title=?")
            prepareStmt.setString(1,title)
            val result = prepareStmt.executeUpdate()
            return result
        }
        fun searchByAuthor(author:String):Int{
            val prepareStmt = connection.prepareStatement("select * from book where author=?")
            prepareStmt.setString(1,author)
            val result = prepareStmt.executeUpdate()
            return result
        }
        fun deleteBook(bookID:String):Int{
            val prepareStmt = connection.prepareStatement("delete from book where bookID=?")
            prepareStmt.setString(1,bookID)
            val result = prepareStmt.executeUpdate()
            return result
        }
    }
}