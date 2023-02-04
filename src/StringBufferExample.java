import java.util.*;
public class StringBufferExample {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer("Mohammed Faiyaz");
        sb.insert(0,"Hi ");
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.insert(0,"Hello ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(1,5,"java");
        System.out.println(sb);
        sb.append("welcome");
        System.out.println(sb);
        System.out.println(sb.capacity());
}}
