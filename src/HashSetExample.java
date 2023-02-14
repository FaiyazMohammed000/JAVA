import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(7);
        set.add(0);
        set.add(3);
        set.add(2);
        set.add(7);
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
