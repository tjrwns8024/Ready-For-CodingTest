package programmers.one

class E {
    fun solution(num: Int): Int {
        var answer = 0
        var a = num

        while (true) {
            if (answer == 500) {
                answer = -1
                break
            } else if (a == 1) {
                break
            } else if (a % 2 == 0) {
                a /= 2
            } else if (a % 2 == 1) {
                a = a * 3 + 1
            }

            answer++
        }

        return answer
    }
}

fun main() {
    val e = E()
    println(e.solution(626331))
}