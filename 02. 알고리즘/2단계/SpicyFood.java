package programmers.two;

import java.util.PriorityQueue;

public class SpicyFood {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        SpicyFood sf = new SpicyFood();
        System.out.println(sf.solution(scoville, K));
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();


            int result = a + (b * 2);

            heap.offer(result);
            answer ++;
        }
        return answer;
    }

}
