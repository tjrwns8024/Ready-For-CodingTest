package programmers.one

class Solution2 {
    fun solution(s: String): String {
        var answer = ""

        val a = s.split(" ")
        println(a)

        for (i in 0 until a.size) {
            val b = a[i].split("")

            for (i in 1 until b.size) {
                if (i % 2 != 0) {
                    answer += b[i].toUpperCase()
                } else {
                    answer += b[i].toLowerCase()
                }
            }
            if (i != a.size - 1) {
                answer += " "
            }
        }

        return answer
    }
}

fun main() {
    val solution2 = Solution2()

    print(solution2.solution("tr hello world"))
}