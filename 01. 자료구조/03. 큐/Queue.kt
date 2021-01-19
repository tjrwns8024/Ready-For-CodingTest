package dataStructure.queue

interface Queue<T> {  // Generic 사용으로 사용자가 원하는 타입을 넣을 수 있다.
    fun enqueue(data: T)
    fun dequeue(): T?
    fun size(): Int
    fun peek(): T?
    fun isEmpty(): Boolean
}