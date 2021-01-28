package programmers.one

class B {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n) { 0 }
        for(i in 1..n){
            answer[i-1] = x*i.toLong()
        }

        return answer
    }
}

fun main(){
    val b = B()
    println(b.solution(2,5)[3])
}