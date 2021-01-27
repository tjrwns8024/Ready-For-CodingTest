package programmers.one

class Solution1 {
    fun solution(n: Int): String {
        var answer = ""

        for(i in 1..n){
            if(i%2==0){
                answer += "박"
            }else {
                answer += "수"
            }
        }

        return answer
    }
}

fun main(){
    val solution = Solution1()
    print(solution.solution(3))
}