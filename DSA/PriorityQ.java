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
    }
}