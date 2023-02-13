import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int meal_cost=sc.nextInt();
        float tip_percentage=sc.nextFloat();
        float tax_percentage= sc.nextFloat();
        float bill=meal_cost+(meal_cost*tip_percentage/100)+(meal_cost*tax_percentage/100);
        System.out.println(bill);
    }
}
