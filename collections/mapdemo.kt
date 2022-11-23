package collections

fun main(){
    var players=mutableMapOf<String ,String>()
    players.put("sachin","is a batsman")
    players.put("dravid","is a batsman")
    players.put("dhoni","is a keeper")
    players.put("shani","is a bowler")
    players.put("bumrah","is a bowler")
    players.put("dhoni","is a coach")
    println(players)
    println("size= ${players.keys}")
    println("keys ${players.keys}")
    println("value ${players.values}")

}