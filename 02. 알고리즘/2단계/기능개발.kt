package programmers.two

class B {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var cnt = 1

        for(i in progresses.indices){
            progresses[i] = Math.ceil((100 - progresses[i]).toDouble() / speeds[i]).toInt()
        }

        var tmp  = progresses[0]

        for (i in 1 until progresses.size) {
            if (progresses[i] <= tmp) {
                cnt++
            } else {
                answer += cnt
                cnt = 1
                tmp = progresses[i]
            }
        }
        
        answer += cnt

        return answer
    }
}

fun main() {
    val b = B()
    val arr1 = intArrayOf(99, 1, 99, 1)
    val arr2 = intArrayOf(1, 1, 1, 1)
    b.solution(arr1, arr2).forEach { print(it) }
}
//
//fun solution(progresses: IntArray, speeds: IntArray): IntArray {
//    val answer : MutableList<Int> = arrayListOf()
//    val days = progresses
//
//    for(i in 0 until progresses.size){
//        days[i] = ((100 - progresses[i])/speeds[i])
//    }
//
//    var max = days[0]
//    var releaseCount = 1
//
//    for(i in 1 until days.size){
//        if(max < days[i]){
//            answer.add(releaseCount)
//            releaseCount = 1
//            max = days[i]
//        }else{
//            releaseCount ++
//        }
//    }
//
//    answer.add(releaseCount)
//
//    return answer.toIntArray()
//}