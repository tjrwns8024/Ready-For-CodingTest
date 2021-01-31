package programmers.one

class Solution4 {
    fun solution(s: String): Boolean {
        var answer = true

        if (s.length in 1..8) {
            println(s.length)
            if (s.length == 4 || s.length == 6) {
                for (i in s.indices) {
                    if (s[i] < 48.toChar() || s[i] > 58.toChar()) {
                        answer = false
                    }
                }
            } else {
                answer = false
            }
        } else {
            answer = false
        }
        return answer
    }
}

fun main() {
    val solution4 = Solution4()
    println(solution4.solution("0"))
}