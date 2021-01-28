fun main() {
    val n: Int = readLine()!!.toInt()

    println(fibo(n))
}

fun fibo(n: Int): Int? {
    val d = Array(n+1) { 0 }
    d[1] = 0

    for (i in 2..n) {
        d[i] = d[i - 1] + 1
        if (i % 2 == 0) {
            if (d[i] > d[i / 2] + 1)
                d[i] = d[i / 2] + 1
        }
        if (i % 3 == 0) {
            if (d[i] > d[i / 3] + 1)
                d[i] = d[i / 3] + 1
        }
    }

//    if (n == 1) {
//        return 0
//    }
//    if (d[n] > 0) {
//        return d[n]
//    }
//
//    d[n] = fibo(n-1)!! + 1
//
//    if(n%3 == 0){
//        val a = fibo(n/3)!! + 1
//        if(a < d[n]) d[n] = a
//
//    }
//    if(n%2 == 0){
//        val b = fibo(n/2)!! + 1
//        if(b < d[n]) d[n] = b
//    }

    return d[n]
}