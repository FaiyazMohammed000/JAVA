/*Rohit would like to book a hotel with cheapest price for N number of days based on his preferred star rating.
        Each Hotel can have rating as (5star or 3star or 1star), and each hotel's per day cost is mentioned below.
        Based on Rohit's star preference and money he has, find if he can get any cheapest hotel.
        Constraints:
        1.  N - no of days ranging from 1 to 31
        2.  star rating - will be any one of (5,3,1)
        3.  amount - the total amount Rohit can spent max.
        Hotel Details:
        1. The Park, 5-star hotel, will cost $90/day, but if customer stays more than 2 days, then customer gets 20% off on total cost.
        2. Hotel Hyaat, 5-star hotel, will cost $82/day, but if customer stays more than 3 days, then customer gets 12% off on total cost.
        3. Raddisson, 3-star hotel, will cost $60/day, but if customer stays more than 3 days, then customer gets 18% off on total cost.
        4. RainTree, 3-star hotel, will cost $58/day, but if customer stays more than 2 days, then customer gets 15% off on total cost.
        5. Accord, 1-star hotel, will cost $41.55/day, but if customer stays more than 3 days, then customer gets 11.8% off on total cost.
        6. Fortune, 1-star hotel, will cost $43/day, but if customer stays more than 4 days, then customer gets 14.8% on total cost.
        Challenge:
        Create a static method "bookHotel" with 3 arguments and return type as string,
        1. money (Double dataType) -  total amount customer has
        2. days  (Integer dataType) - no.of.days customer like to stay.
        3. rating (Integer dataType) - preferred star rating for the hotel.
        Based on given input, if cheapest hotel is found return string like below,
        'Hotel Booked for "days" days in "star" star Hotel "hotel name" for the cost of "totalCost for hotel"'
        Example:
        "Hotel Booked for 2 days in 3 star hotel The Park for the cost of $186.5"
        If no cheapest hotel is found for the customer, the return string like below,
        Example:
        'Sorry! you dont have sufficient amount to book any hotel'
        */
class Hotel
{
    String name;
    int starRatings;
    double costPerDay;
    int discountdays;
    double disountPercentage;
    public Hotel(String name,int starRatings,double costPerDay,int discountdays,double disountPercentage)
    {
        this.name=name;
        this.starRatings=starRatings;
        this.costPerDay=costPerDay;
        this.discountdays=discountdays;
        this.disountPercentage=disountPercentage;
    }
    public double getCost(int days)
    {
        double cost=costPerDay*days;
        if(days>discountdays)
        {
            cost=cost-cost*disountPercentage/100;
        }
        return cost;
    }
}
public class HotelBookingWithoops {
     public static String bookHotel(double money,int days, int ratings,Boolean autoUpgrade) {
         Hotel[] hotels = {
                 new Hotel("The Park", 5, 90, 2, 20),
                 new Hotel("Hotel Hyaat",5,82,3,12),
                 new Hotel("Radisson",3,60,3,18),
                 new Hotel("RainTree",3,58,2,15),
                 new Hotel("Accord",1,41.55,3,11.8),
                 new Hotel("Fortune",1,43,4,14.8),
                 new Hotel("Faiyaz",5,19,2,20)
        };
         Hotel cheapestHotel=null;
         for (Hotel hotel:hotels) {
             if (hotel.starRatings >= ratings && hotel.getCost(days) <= money && days >= 1 && days <= 31) {
                 if (cheapestHotel == null || hotel.getCost(days) < cheapestHotel.getCost(days)) {
                     cheapestHotel = hotel;
                    if(autoUpgrade==false&&cheapestHotel.starRatings>ratings)
                     {
                     cheapestHotel=null;
                     }
                     else if (autoUpgrade==true&&cheapestHotel.starRatings>ratings) {
                         ratings=cheapestHotel.starRatings;
                     }
                 }
            }
         }
         if (cheapestHotel==null)
         {
             return "Sorry! you don't have sufficient amount to book any hotel or Minimum booking days should be greater than one";
         }
         else {
             double totalCost=cheapestHotel.getCost(days);
             return "Hotel Booked for "+days+" days in "+ratings+" star Hotel "+cheapestHotel.name+" for the cost of &"+totalCost;
         }
     }
    public static void main(String[] args) {
         System.out.println(bookHotel(1000,1,3,true));
        System.out.println(bookHotel(100000,0,3,true));
        System.out.println(bookHotel(200,1,5,false));
    }
}
