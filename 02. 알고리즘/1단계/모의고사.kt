package programmers.one

class M {
    fun solution(answers: IntArray): IntArray {
        val answer_1 = intArrayOf(1, 2, 3, 4, 5)
        val answer_2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val answer_3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        val answer = Array(3) { 0 }
        var maxPerson = intArrayOf()

        for (i in answers.indices) {
            if (answer_1[i % 5] == answers[i])
                answer[0] += 1

            if (answer_2[i % 8] == answers[i])
                answer[1] += 1

            if (answer_3[i % 10] == answers[i])
                answer[2] += 1
        }

        var max = answer[0]
        for (i in answer.indices) {
            if (answer[i] >= max) {
                max = answer[i]
                maxPerson += i + 1
            }
        }
        maxPerson.sorted()
        println(maxPerson.contentToString())

        return maxPerson
    }

}

fun main() {
    val answers = intArrayOf(1, 2, 3, 4, 5, 2)
    val m = M()

    m.solution(answers)
}