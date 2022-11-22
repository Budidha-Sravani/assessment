fun main()
{
    for(i in 1..5) {
        for (space in 1..5-i+1)
            print(" ")
        for (j in 1..i) {
            /*for (k in 1..i) {
                print("* ")
            }*/
            print("* ")
        }
        println()
    }
}