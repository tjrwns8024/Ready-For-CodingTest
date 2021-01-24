package programmers.two

class C {
    fun solution(n: Int): Int {
        var answer = 0
        val fibo = arrayOfNulls<Int>(100000)

        fibo[0] = 0
        fibo[1] = 1

        for(i in 2..n){
            fibo[i] = (fibo[i-1]!! % 1234567 + fibo[i-2]!! % 1234567) % 1234567
        }

        answer += fibo[n]!! % 1234567

        return answer
    }
}

fun main(){
    val c = C()
    println(c.solution(3))
}