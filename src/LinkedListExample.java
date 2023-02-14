import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        LinkedList<Integer> l=new LinkedList<>();
        for (int i=0;i< a.length;i++)
        {
            l.add(sc.nextInt());
        }
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        Iterator it= l.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
