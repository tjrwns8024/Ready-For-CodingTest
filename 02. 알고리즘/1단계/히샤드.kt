package programmers.one

class Solution {
    fun solution(x: Int): Boolean {
        var answer = false
        val a = x.toString().split("")
        var sum = 0

        for (i in 1 until a.size - 1) {
            sum += Integer.parseInt(a[i])
        }

        answer = x % sum == 0

        return answer
    }
}

fun main() {
    val solution = Solution()

    print(solution.solution(11))
}