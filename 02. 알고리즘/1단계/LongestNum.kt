fun main() {
    var answer: IntArray = intArrayOf(2, 1, 3, 4, 1)
    var que: ArrayList<Int> = arrayListOf()

    for (i in answer.indices) {
        for (j in answer.indices) {
            if (i != j) {
                que.add(answer[i] + answer[j])
            }
        }
    }

    print(que.distinct().sorted())
}