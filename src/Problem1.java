import  java.util.*;
import java.lang.*;
public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem1 obj = new Problem1();
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                try {
                    long n = sc.nextLong();
                    System.out.println(n + " can be fitted in :");
                    if (n >= (-Math.pow(2, 8) / 2) && n <= ((Math.pow(2, 8) / 2) - 1)) {
                        System.out.println("byte");
                    }
                    if (n >= (-Math.pow(2, 16) / 2) && n <= ((Math.pow(2, 16) / 2) - 1)) {
                        System.out.println("short");
                    }
                    if (n >= (-Math.pow(2, 32) / 2) && n <= ((Math.pow(2, 32) / 2) - 1)) {
                        System.out.println("int");
                    }
                    if (n >= (-Math.pow(2, 64) / 2) && n <= ((Math.pow(2, 64) / 2) - 1)) {
                        System.out.println("long");
                    }
                }
                 catch (InputMismatchException e) {
                        System.out.println(sc.next()+" can't be fitted anywhere.");
                    }
            }
        }
    }


