import java.util.*;
import java.lang.*;
public class StringBuilderExample {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(1,4,"great");
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);
        sb.insert(1,"java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}

