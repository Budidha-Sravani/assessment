package KotlinTask25Nov
class Wrestler(name:String,age:Int,height:Int,weight:Int){
    var name:String=name
    var age:Int=age
    var height:Int=height
    var weight:Int=weight

}
fun main(){

    var wrestlers=mutableListOf<Wrestler>()

    wrestlers.add(Wrestler("Sravani",24,5,50))
    wrestlers.add(Wrestler("Ruchi",30,6,55))
    wrestlers.add(Wrestler("Nikki",27,5,56))
    println("wrestler")
    for(wrestler in wrestlers){
        println("${wrestler.name} ${wrestler.age} ${wrestler.height} ${wrestler.weight}")
    }
    println("List of Wrestlers age greather than 32")
    for(wrestler in wrestlers) {
        if(wrestler.age>20){
            println("${wrestler.name} ${wrestler.age}")
        }
    }
    println("List of Wrestlers weight greather than 50")
    for(wrestler in wrestlers){
        if(wrestler.weight>55){
            println("${wrestler.name} ${wrestler.weight}")
        }
    }
}