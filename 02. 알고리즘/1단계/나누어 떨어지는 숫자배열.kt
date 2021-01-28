package programmers.one

class H {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()

        for(i in arr){
            if(i % divisor == 0){
                answer += i
            }
        }
        answer.sort()

        if(answer.isEmpty()){
            answer += -1
        }

        return answer
    }
}

fun main(){
    val h = H()
    val arr1 = intArrayOf(2, 36, 1, 3)
    h.solution(arr1, 1).forEach { print("$it ") }
}