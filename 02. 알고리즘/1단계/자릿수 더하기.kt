package programmers.one

class D {
    fun solution(n: Int): Int {
        var answer = 0
        val num = n.toString()

        for(i in num.indices){
            answer += num[i].toInt()-48
        }

        return answer
    }
}

fun main() {
    val solution = D()
    println(solution.solution(987))
}