import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        Vector<Character> l=new Vector<>();
        l.add('H');
        l.add('E');
        l.add('L');
        l.add('L');
        l.add('O');
        System.out.println(l);
        l.remove(4);
        Iterator it= l.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
