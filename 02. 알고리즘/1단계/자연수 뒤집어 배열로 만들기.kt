package programmers.one

class I {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        val x = n.toString().split("")

        for(i in x.size-2 downTo 1){
            answer += x[i].toInt()
        }

        return answer
    }
}

fun main() {
    val i = I()
    i.solution(12345).forEach { print(it) }
}