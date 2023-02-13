import java.util.*;
import java.lang.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();

        for(int i=1;i<=q;i++)
        {
            int sum=0;
           int a= sc.nextInt();
           int b= sc.nextInt();
           int n= sc.nextInt();
           for(int j=0;j<n;j++)
           {
               sum+=(a+Math.pow(2,j)*b);
               System.out.print(sum+" ");
           }
        }
    }
}
