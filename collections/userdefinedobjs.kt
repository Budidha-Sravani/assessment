package collections

class Product(id:Int,name:String,price:Double)
{
    var id:Int=id
    var name:String=name
    var price:Double=price

}
fun main() {
    var products= mutableListOf<Product>()
    products.add (Product(1,"laptop",56000.50))
    products.add(Product(2,"mobile",87000.50))
    products.add(Product(3,"shirt",4000.20))
    for (product in products)
        println("${product.id} ${product.name} ${product.price}")


}

