package programmers.one

class K {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        for (i in commands.indices) {
            val start = commands[i][0]
            val end = commands[i][1]
            answer += array.slice(start - 1 until end).sorted()[commands[i][2] - 1]
        }

        return answer
    }
}

fun main() {
    val k = K()
    val numArr = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))

    k.solution(numArr, commands)
}