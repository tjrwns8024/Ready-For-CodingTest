package programmers.one

class J {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var arr1 = intArrayOf()
        var y = ""
        val x = n.toString().split("")

        for (i in 1 until x.size - 1) {
            arr1 += x[i].toInt()
        }
        arr1.sort()

        for (i in arr1.size-1 downTo 0){
            y += arr1[i]
        }

        answer = y.toLong()

        return answer
    }
}

fun main() {
    val j = J()
    println(j.solution(118372))
}