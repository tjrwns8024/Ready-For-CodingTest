package programmers

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)


    for(x in 1..a){
        for(y in 1..b){
            print("*")
        }
        println()
    }
}