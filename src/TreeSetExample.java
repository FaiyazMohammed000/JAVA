import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(7);
        set.add(0);
        set.add(3);
        set.add(2);
        set.add(7);
        set.add(15);
        set.add(5);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        Iterator it= set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
