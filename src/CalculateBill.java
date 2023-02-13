/*A person goes to a hotel and orders a meal, help him calculate the total bill which includes tax percentage and tip percentage.
        so give the tip percentage and tax percentage on the meal derive the total money he has to pay to the hotel.
        Constraints:
        0 < mealcost
        0 <= tip percentage
        0 <= tax percentage

        Sample input:

        300         // meal cost
        20.0        // tip percentage
        11          // tax percentage

        Sample output:

        the total bill to be paid is 393*/

import java.util.*;
public class CalculateBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int meal_cost=sc.nextInt();
        float tipPercentage=sc.nextFloat();
        float taxPercentage= sc.nextFloat();
        float bill=meal_cost+(meal_cost*tipPercentage/100)+(meal_cost*taxPercentage/100);
        System.out.println(bill);
    }
}
