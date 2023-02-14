import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> l=new Stack<>();
        l.push(9);
        l.push(8);
        l.push(7);
        l.push(6);
        System.out.println(l);
        System.out.println(l.peek()+" is the peek element");
        l.pop();
        Iterator it= l.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
