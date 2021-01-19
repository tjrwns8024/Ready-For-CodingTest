package dataStructure.queue

class QueueImpl : Queue<String> {
    private val list = mutableListOf<String>()

    override fun enqueue(data: String) {
        list.add(data)
    }

    override fun dequeue(): String? {
        return if (list.isNotEmpty()) {
            return list.removeAt(0)
        } else {
            null
        }
    }

    override fun size(): Int = list.size

    override fun peek(): String? {
        return if (list.isNotEmpty()) {
            list[0]
        } else {
            null
        }
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}