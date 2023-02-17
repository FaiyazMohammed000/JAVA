
/* Task 1:

    Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter.
    The constructor must assign  initialAge to  age after confirming the argument passed as initialAge is not negative;
    if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0..
    In addition, you must write the following instance methods:
    yearPasses() should increase the age instance variable by 1.
    amIOld() should perform the following conditional actions:
    If age < 13, print You are young..
    If age >= 13 and age < 18, print You are a teenager..
    Otherwise, print You are old..
    To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future.
    Input Format
    The first line contains an integer, T (the number of test cases), and the T subsequent lines each contain an integer denoting the age of a Person instance.
    Constraints:
    1 <= T<= 4
    -5 <= age <= 30
    Output Format:
    If your methods are implemented correctly, each test case will print 2 or 3 lines (depending on whether or not a valid initialAge was passed to the constructor).
    Sample Input:
    4
    -1
    10
    16
    18
    Sample Output:
    Age is not valid, setting age to 0.
    You are young.
    You are young.
    You are young.
    You are a teenager.
    You are a teenager.
    You are old.
    You are old.
    You are old.
*/
import java.util.Scanner;

public class PersonAgeType {
    static class Person {
        int age = 0;

        public Person(int initialAge) {

            if (initialAge > 0) {
                age = initialAge;
            } else {
                System.out.println("Age is not valid, setting age to 0.");
                age = 0;
            }
        }

        public void amIOld() {
            if (age < 13)
                System.out.println("You are young.");
            else if (age >= 13 && age < 18)
                System.out.println("You are a teenager.");
            else
                System.out.println("You are old.");
        }

        public void yearPasses() {
            age++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++)
        {
            int age= sc.nextInt();
            Person p=new Person(age);
            p.amIOld();
            for (int j=0;j<3;j++)
            {
                p.yearPasses();
            }
           p.amIOld();
        }
       sc.close();
    }
}