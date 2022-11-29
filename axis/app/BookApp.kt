package com.axis.app

import com.axis.service.BookService
import com.axis.modal.BookModal
import com.axis.service.BookException
import com.axis.service.BookValidations
import com.axis.utility.BookStoreUtility
import java.util.Scanner

fun main(){

    var bookService=BookService()
    var scanner=Scanner(System.`in`)
    println("------------menu------------")
    println("1.Add book \n2.Modify book \n3.Delete book \n4.Display all books \n5.Display specific book \n6.Search book by title \n7.Search book by author")
    println("Enter your choice")
    var choice=scanner.nextInt()
    while(choice<8){
        when(choice){
            1->{
                //add book
                println("Enter bookID:")
                var bookID=scanner.nextLine()
                println("Enter book title:")
                var title=scanner.nextLine()
                println("Enter book author:")
                var author=scanner.nextLine()
                println("Enter book category:")
                var category=scanner.nextLine()
                println("Enter book price:")
                var price=scanner.nextFloat()
                var book=BookModal(bookID,title,author,category,price)
                var result=bookService.addBook(book)
                if(result>0){
                    bookService.addBook(book)
                }
                else{
                    println("check the details ")
                }
            }
            2->{
                println("Enter bookID to modify:")
                var bookID=scanner.nextLine()
                println("Enter which value to be modified")
                var value=scanner.nextLine()
                bookService.updateBook(bookID,value)
            }
            3->{
                println("Enter the bookID to delete:")
                var bookID=scanner.nextLine()
                bookService.deleteBook(bookID)
            }
            4->{
                bookService.displayAll()
            }
            5->{
                println("Enter bookID to display")
                var bookID=scanner.nextLine()
                bookService.displaySpecificBook(bookID)
            }
            6->{

                println("Enter book title to search")
                var title=scanner.nextLine()
                bookService.searchByTitle(title)
            }
            7->{

                println("Enter book author to search")
                var author=scanner.nextLine()
                bookService.searchByAuthor(author)
            }
            else->{
                println("Enter the correct choice")
                break
            }
    }

    }
}
