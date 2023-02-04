import java.util.*;
import java.lang.*;
public class StringExample3 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=str.replaceAll(" ","");
        System.out.println(str2);
        String str3=str2.replaceAll("[aieou]","");
        System.out.println(str3);
    }

}
