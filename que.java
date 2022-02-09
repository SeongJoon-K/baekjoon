import java.util.LinkedList;
import java.util.Queue;

public class que {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // int형 queue를 선언한다.
        queue.add(3);
        queue.offer(4);

        System.out.println("## 큐");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        queue.peek();
    }
    
}
/*
큐 (Queue)
-FIFO형 자료구조
-자바에서 Queue는 인터페이스이므로 객체 생성이 불가능함.
-그러므로 LinkedList 형변환을 하는 거임.

Queue = ["데이터1", "데이터2","데이터3"]  
여기서 front = 0(젤 앞에 있는거) rear = 2 (젤 뒤에 있는거)

queue.peek() 는 큐의 front값을 반환
queue.poll() 는 큐의 front값을 반환 후 삭제한다.
스택의 경우 push pop이지만, 큐는 poll임
queue.offer(값) 은 큐에 값을 추가한다.
queue.isEmpty() false


*/

