package programmers.one

import kotlin.math.pow

class G {
    fun solution(n: Int): Int {
        var answer = 0
        var num = n
        val arr = arrayListOf<Int>()

        while(num > 0){
            arr.add(num % 3)
            num /= 3
        }
        arr.reverse()

        for(i in arr.size-1 downTo 0){
            var pow = 1
            for(j in 1..i){
                pow *= 3
            }
            answer += pow * arr[i]
        }

        return answer
    }
}

fun main() {
    val g = G()
    println(g.solution(125))
}