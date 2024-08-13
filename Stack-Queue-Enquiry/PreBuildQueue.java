import java.util.Queue;
import java.util.LinkedList;

public class PreBuildQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);
        queue.offer(500);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.poll();
        System.out.println(queue);
        queue.offer(88);
        System.out.println(queue);
    }
}
