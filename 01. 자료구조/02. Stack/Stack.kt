package dataStructure

import java.util.*

fun main(){
    val stack = Stack<String>() //Java에 있는 Stack 클래스 사용

    //데이터 삽입

    stack.push("a") // a 데이터 삽입
    stack.push("b") // b 데이터 삽입
    stack.push("c") // c 데이터 삽입
    stack.push("d") // d 데이터 삽입
    stack.add(0,"z") //0번 인덱스 , 즉 가장 아래 z 데이터 삽입

    println(stack) // [z, a, b, c, d]

    // 데이터 탐색

    println(stack.peek()) // 현재 가장 위에 있는 데이터 d
    println(stack.size) // 스택의 크기 5
    println(stack[1]) // 스택 1번 인덱스에 들어있는 데이터 a
    println(stack.search("c")) // "c" 데이터가 위에서부터 2번째에 있다.
    println(stack.search("e")) // "e" 데이터가 없기 때문에 -1 반환


    // 삭제

    while(stack.isNotEmpty()) {
        println("POP : ${stack.pop()}") // Pop 하면서 원소를 반환해준다
    }
//    POP : d
//    POP : c
//    POP : b
//    POP : a
//    POP : z
}