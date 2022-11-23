package collections
fun main() {
    var players = mutableMapOf<String,String>()
    players.put("sachin","is a batsman")
    players.put("dravid","is a batsman")
    players.put("dhoni","wicket keeper ")
    players.put("shami","is a bowler")
    players.put("bumrah","is a bowler")
    players.put("dhoni","is a coach")
    println(players)
    println(" size = ${players.size}")
    println("keys ${players.keys}")
    println("value ${players.values}")
    println("both key and value ${players.entries}")
    println(players.get("dravid"))
    var a = players.get("dravid")
    println(a)
    println("--------")
    for (key in players.keys)
        println(key)
    println("----------")
    for(keyValue in players.entries)
        println(keyValue)



}
