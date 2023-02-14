import java.util.*;
public class ArrayDequeueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(3);
        ad.addFirst(2);
        ad.addLast(4);
        ad.addLast(5);
        ad.addFirst(1);
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);
        Iterator it =ad.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
