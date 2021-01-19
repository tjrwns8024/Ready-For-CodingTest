# Queue (큐)

## Queue 란?

- 큐 또한 스택과 같이 대표적인 자료구조이다.   

- 순서있는 리스트이다. 

- 삽입 연산은 한쪽 끝에서 일어난다. (**rear**)

- 삭제 연산은 삽입의 반대쪽에서 일어난다. (**front**)

<br/>


## Queue 구조 

### **FIFO** ( first in first out )

- 먼저 들어오는 것이 먼저 나간다. 

> ex) 은행창구 번호표 

<br/>


## Queue Overflow  

**queue overflow**
- 큐가 꽉차서 삽입 불가능 할 경우  

**queue underflow**
- 큐가 비어서 자료를 꺼낼 수 없는 경우 

<br/>


## Queue ADT
// kotlin의 mutableList를 통해 Queue를 구현 

**front(head)**
- 데이터를 dequeue 할 수 있는 위치

**rear(tail)**
- 데이터를 enqueue 할 수 있는 위치

### **Method**

- isEmpty() -> Boolean  

```kotlin
override fun isEmpty(): Boolean {
        return list.isEmpty()
    }
```

- enqueue -> insert ( 데이터 삽입 )  

```kotlin
override fun enqueue(data: String) {
        list.add(data)
    }
```

- dequeue -> delete ( 데이터 삭제 ) 

```kotlin
override fun dequeue(): String? {
        return if (list.isNotEmpty()) {
            return list.removeAt(0)
        } else {
            null
        }
    }
```

- peek -> 탐색 ( 맨 앞 값을 반환 )

```kotlin
override fun peek(): String? {
        return if (list.isNotEmpty()) {
            list[0]
        } else {
            null
        }
    }
```

<br/>


![](https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F9929C0495C932BB115)