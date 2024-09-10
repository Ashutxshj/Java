import java.util.*;
public class PriorityQ{
    public static void main(String[] args){
        //Priority Queue = First-In First-Out
        //*Higher priorities first before elements with lower priority

        Queue<Double> q= new LinkedList<>();
        q.offer(3.0);
        q.offer(2.5);
        q.offer(4.0);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println("Now in Order");
        Queue<Double> q1= new PriorityQueue<>();
        q1.offer(3.0);
        q1.offer(2.5);
        q1.offer(4.0);

        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }
        //? Now in Reverse

        System.out.println("Now in Reverse");
        Queue<Double> q2= new PriorityQueue<>(Collections.reverseOrder());
        q2.offer(3.0);
        q2.offer(2.5);
        q2.offer(4.0);

        while(!q2.isEmpty()){
            System.out.println(q2.poll());
        }
    }
}