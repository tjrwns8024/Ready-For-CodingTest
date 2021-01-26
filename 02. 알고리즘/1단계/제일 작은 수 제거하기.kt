package programmers.one

class F {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var tmp = arr[0]

        if(arr.size == 1){
            answer += -1
        }else {
            for(i in arr.indices){
                if(arr[i] <= tmp){
                    tmp = arr[i]
                }
            }

            val result = arr.toMutableList()
            for(i in arr.indices){
                if(arr[i] == tmp){
                    result.removeAt(i)
                }
            }

            answer = result.toIntArray()
        }

        return answer
    }
}

fun main() {
    val arr = intArrayOf(10)
    val f = F()

    println(f.solution(arr).forEach {
        println(it)
    })
}