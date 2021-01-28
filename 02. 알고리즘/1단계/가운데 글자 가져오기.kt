package programmers.one

class C {
    fun solution(s: String): String {
        var answer = ""

        if(s.length %2 == 1){
            answer += s[s.length /2]
        } else {
            answer +=  "${s[s.length /2 -1]}${s[s.length/2 ]}"
        }
        return answer
    }
}

fun main() {
    val solution = C()
    println(solution.solution("qwer"))
}