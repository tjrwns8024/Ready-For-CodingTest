package programmers.two

class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        val newSorted = numbers.sortedWith(Comparator<Int> { a, b ->
            when {
                a % 10 < b % 10 -> 1
                a % 10 > b % 10 -> -1
                else -> 0
            }
        })


        newSorted.forEach{
            answer += it.toString()
        }

        return answer
    }
}

fun main() {
    val arr = intArrayOf(1,2,3,4,112)
    val solution = Solution()
    println(solution.solution(arr))
}

