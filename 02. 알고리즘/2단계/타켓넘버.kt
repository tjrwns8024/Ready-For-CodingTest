package programmers.two

class T {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0

        fun dfs(depth: Int, sum: Int) {
            if (depth == numbers.size) {
                if (sum == target) {
                    answer += 1
                } else {
                    return
                }
            } else {
                dfs(depth + 1, sum + numbers[depth])
                dfs(depth + 1, sum - numbers[depth])
            }
        }
        dfs(0, 0)

        return answer
    }
}

fun main() {
    val t = T()
    val numbers = intArrayOf(1, 1, 1, 1, 1)
    val target = 3

    println(t.solution(numbers, target))
}