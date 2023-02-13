/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
        A byte is an 8-bit signed integer.
        A short is a 16-bit signed integer.
        An int is a 32-bit signed integer.
        A long is a 64-bit signed integer.

    ** Challenge to solve : Given an input integer, you must determine which primitive data types are capable of properly storing that input. **

    Input Format:
    The first line contains an integer T, denoting the number of test cases.
    Each test case T, is comprised of a single line with an integer n, which can be arbitrarily large or small.

    Output Format
    For each input variable  and appropriate primitive n, you must determine if the given primitives are capable of storing it. If yes, then print:
    n can be fitted in:
    * dataType
    If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long).
    If the number cannot be stored in one of the four aforementioned primitives, print the line:
    n can't be fitted anywhere.

    Sample Input:
    5
    -150
    150000
    1500000000
    213333333333333333333333333333333333
    -100000000000000

    Sample Output:
    -150 can be fitted in:
    * short
    * int
    * long
    150000 can be fitted in:
    * int
    * long
    1500000000 can be fitted in:
    * int
    * long
    213333333333333333333333333333333333 can't be fitted anywhere.
    -100000000000000 can be fitted in:
    * long
    Explanation:
    -150 can be stored in a short, an int, or a long.
    213333333333333333333333333333333333 is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.
*/
import  java.util.*;
import java.lang.*;
public class DataTypeVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            } catch (InputMismatchException e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}