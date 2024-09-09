import java.util.Queue;
import java.util.LinkedList;

public class Queues{
    public static void main(String[] args){

        //Queue = First-In First-Out
        //* add = enqueue,offer()
        //* remove = dequeue,poll()

        //? Queue<String> queue = new Queue<String>();
        //Queue is actually an interface and not a class so no instances

        Queue<String> q = new LinkedList<String>();
        q.offer("Karen");
        q.offer("Chad");
        q.offer("Steve");
        q.offer("Harold");

        q.add("Ashu");
        q.add("Tosh");

        System.out.println(q.peek());
        System.out.println(q);

        q.poll();
        System.out.println(q);

        System.out.println(q.isEmpty());

        System.out.println(q.size());
        System.out.println(q.contains("Ashu"));

        //! Keyboard Buffer
        //! LinkedLists,PriorityQueues,BFS



        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.remove());
        System.out.println("Dequeued element: " + queue.remove());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Get the size of the queue
        System.out.println("Queue size: " + queue.size());
    }
}