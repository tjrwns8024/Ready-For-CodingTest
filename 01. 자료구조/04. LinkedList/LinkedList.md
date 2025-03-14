# LinkedList ( 링크드 리스트 )

## LinkedList 란?

- **연결 리스트**라고도 부른다.  

- 정해진 공간에 데이터를 나열해야한다는 **배열의 단점을 극복**하였다.  

- 정해진 크기의 공간 없이, 필요할 때마다 데이터를 **추가하고 삭제가 가능**하다. 

- **떨어진 곳에 존재하는 데이터**를 화살표로 연결해서 관리하는 데이터 구조 


<br/>

## 종류 

1. **싱글 링크드 리스트** 
    - 노드 안에 링크가 1개이고 단방향으로 진행하는 **리스트**

2. **더블 링크드 리스트** 
    - 노드 안에 링크가 2개이고 양방향으로 진행하는 **리스트** 

3. **환형 링크드 리스트** 
    - 마지막 노드가 첫번째 노드를 가르쳐서 계속 회전 할 수 있게 만들어진 **리스트** 


<br/>

![](https://t1.daumcdn.net/cfile/tistory/1834F84B4F17A79012)


<br/>


## 장/단점 

1.  메모리 할당 효율   

    - 정적으로 input 사이즈를 정하고 데이터를 받는 array와 달리 동적으로 데이터를 받는 List가 효율성이 좋다 

    - Array < List

2. 데이터 하나 당 추가 소요되는 메모리의 양 

    - LinkedList의 다음 데이터의 주소를 가리키는 링크 부분이 4bytes를 차지하기 때문에 Array가 효율성이 좋다. 

    - Array > List 

3. 데이터 추가/ 삭제 효율성 

    - Array에서 데이터를 삭제할 시 그 다음 index들을 한칸씩 앞으로 땡겨야 한다.

    - 반면, LinkedList는 앞뒤 링크만 바꿔 연결해주면 되기 때문에 LinkedList가 효율성이 좋다.  
