import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("Mohammed");
        list.add("Faiyaz");
        list.set(1,"Hello");
        list.remove(1);
        Iterator it= list.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
