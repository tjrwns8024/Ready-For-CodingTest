fun main() {
    val n: Int = readLine()!!.toInt()

    println(build(n))
}

fun build(n: Int):Int {
    val d = Array(n+1) { 1 }
    d[0] = 1
    d[1] = 1

    for(i in 2..n){
        d[i] = (d[i-1]%10007 + d[i-2]%10007) % 10007
    }
    return d[n]
}
