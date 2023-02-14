import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(3);
        q.add(1);
        q.add(5);
        q.add(2);
        q.add(4);
        System.out.println("the head is : "+q.element());//also denotes the peek.
        System.out.println("the head is : "+q.peek());
        System.out.println(q);
        System.out.println(q.poll());   // q.remove() also works same
        System.out.println(q);
        Iterator it= q.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
