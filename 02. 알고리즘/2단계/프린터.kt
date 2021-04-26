package programmers.two

import java.util.*

class E {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var list = mutableListOf<Map<Int, Int>>()

        for (i in priorities.indices) {
            val map = mutableMapOf<Int, Int>()
            map[i] = priorities[i]
            list.add(map)
        }

        val stack = Stack<Map<Int, Int>>()
        var index = 0

        for (i in list.size-1 downTo 0) {
            stack.push(list[i])
        }

        while(index == location){
            if((list[index][index])!! < (list[index+1][index+1]!!)){
                stack.pop()
                stack.push(list[index])
            } else {
                stack.pop()
            }

            index++
        }


        println(stack)
        println(stack.pop())
        println(stack)
        stack.push(list[index])
        println(stack)
        println(index)

        return answer
    }
}

fun main() {
    val e = E()
    val array = intArrayOf(2, 1, 3, 2)

    e.solution(array, 2)
}