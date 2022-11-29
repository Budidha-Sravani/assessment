package com.axis.service
import com.axis.service.BookException
import com.axis.modal.BookModal
import com.axis.utility.BookStoreUtility
class BookValidations{
    fun validateCategory(category:String){
       if((category=="Science")||(category=="Fiction")
           ||(category=="Technology")||(category=="Others"))
           println(category)
        else
            throw BookException("category must be Science or Fiction or Technology or Others")
    }
    fun validatePrice(price:Float){
        if(price>0)
            println(price)
        else
            throw BookException("price cannot be negative")
    }
    fun validatebookID(bookID:String){
        if(bookID.get(0)=='B'&&bookID.length==4)
            println(bookID)
        else
            throw BookException("bookID must start with 'B' and book length must be 4 characters ")
    }

}