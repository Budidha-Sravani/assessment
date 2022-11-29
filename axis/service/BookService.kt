package com.axis.service

import  com.axis.modal.BookModal
import com.axis.utility.BookStoreUtility
class BookService{
    var bookStoreUtility=BookStoreUtility()
    fun addBook(book:BookModal):Int{
        var result=bookStoreUtility.addBook(book)
        return result
    }
    fun updateBook(bookID:String,updateValue:String){
        var result=bookStoreUtility.updateBook(bookID,updateValue)
        return result
    }
    fun deleteBook(bookID:String){
        var result=bookStoreUtility.deleteBook(bookID)
        return result
    }
     fun displayAll(){
        var result= bookStoreUtility.displayAll()
         return result
     }
    fun displaySpecificBook(bookID:String){
        var result=bookStoreUtility.displaySpecificBook(bookID)
        return result
    }
    fun searchByTitle(title:String) {
        var result = bookStoreUtility.searchByTitle(title)
        return result
    }
    fun searchByAuthor(author:String){
        var result=bookStoreUtility.searchByAuthor(author)
        return result
    }
}


