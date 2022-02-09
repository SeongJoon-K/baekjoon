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
