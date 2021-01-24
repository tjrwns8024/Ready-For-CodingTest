package programmers.two

class A {
    fun solution(s: String): String {
        var answer = ""
        val arr = s.split(" ")
        var max = arr[0].toInt()
        var min = arr[0].toInt()

        for(i in arr.indices){
            if(arr[i].toInt() >= max){
                max = arr[i].toInt()
            }
        }

        for(i in arr.indices){
            if(arr[i].toInt() <= min.toInt()){
                min = arr[i].toInt()
            }
        }

        answer = "$min $max"

        return answer
    }
}

fun main() {
    val a = A()
    println(a.solution("-1 -2 -3 -4"))
}