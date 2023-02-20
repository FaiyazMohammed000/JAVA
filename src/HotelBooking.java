/*Rohit would like to book a hotel with cheapest price for N number of days based on his preferred star rating.
        Each Hotel can have rating as (5star or 3star or 1star), and each hotel's per day cost is mentioned below.
        Based on Rohit's star preference and money he has, find if he can get any cheapest hotel.
        Constraints:
        1.  N - no of days ranging from 1 to 31
        2.  star rating - will be any one of (5,3,1)
        3.  amount - the total amount Rohit can spent max.
        Hotel Details:
        1. The Park, 5 star hotel, will cost $90/day, but if customer stays more than 2 days, then customer gets 20% off on total cost.
        2. Hotel Hyaat, 5 star hotel, will cost $82/day, but if customer stays more than 3 days, then customer gets 12% off on total cost.
        3. Raddisson, 3 star hotel, will cost $60/day, but if customer stays more than 3 days, then customer gets 18% off on total cost.
        4. RainTree, 3 star hotel, will cost $58/day, but if customer stays more than 2 days, then customer gets 15% off on total cost.
        5. Accord, 1 star hotel, will cost $41.55/day, but if customer stays more than 3 days, then customer gets 11.8% off on total cost.
        6. Fortune, 1 star hotel, will cost $43/day, but if customer stays more than 4 days, then customer gets 14.8% on total cost.
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

public class HotelBooking {

  public static String bookHotel(double money, int days, int rating) {
    String hotelName = "";
    double totalCost = 0;
    boolean cheapestFound = false;

    // Calculate cost for Hyaat hotel
    if (rating == 5 && days>=1&&days<=31) {
      double cost = days * 82;
      if (days > 3) {
        cost = cost - (cost * 0.12);
      }
      if (cost <= money) {
        totalCost = cost;
        hotelName = "Hyaat";
        cheapestFound = true;
      }
    }
    // Calculate cost for The Park hotel

    if (rating == 5  && days>=1&&days<=31  && !cheapestFound) {
      double cost = days * 90;
      if (days > 2) {
        cost = cost - (cost * 0.2);
      }
      if (cost <= money) {
        totalCost = cost;
        hotelName = "The Park";
        cheapestFound = true;
      }
    }



    // Calculate cost for RainTree hotel
    if (rating == 3 && !cheapestFound && days>=1&&days<=31) {
      double cost = days * 58;
      if (days > 2) {
        cost = cost - (cost * 0.15);
      }
      if (cost <= money) {
        totalCost = cost;
        hotelName = "RainTree";
        cheapestFound = true;
      }
    }
    // Calculate cost for Raddisson hotel
    if (rating == 3 && !cheapestFound && days>=1&&days<=31) {
      double cost = days * 60;
      if (days > 3) {
        cost = cost - (cost * 0.18);
      }
      if (cost <= money) {
        totalCost = cost;
        hotelName = "Raddisson";
        cheapestFound = true;
      }
    }

    // Calculate cost for Accord hotel
    if (rating == 1 && !cheapestFound && days>=1&&days<=31) {
      double cost = days * 41.55;
      if (days > 3) {
        cost = cost - (cost * 0.118);
      }
      if (cost <= money) {
        totalCost = cost;
        hotelName = "Accord";
        cheapestFound = true;
      }
    }

    // Calculate cost for Fortune hotel
    if (rating == 1 && !cheapestFound && days>=1&&days<=31) {
      double cost = days * 43;
      if (days > 4) {
        cost = cost - (cost * 0.148);
      }
      if (cost <= money) {
        totalCost = cost;
        hotelName = "Fortune";
        cheapestFound = true;
      }
    }

    if (cheapestFound) {
      return "Hotel Booked for " + days + " days in " + rating + " star hotel " + hotelName + " for the cost of $" + totalCost;
    } else {
      return "Sorry! you don't have sufficient amount to book any hotel or Insufficient data";
    }
  }

  public static void main(String[] args) {
    // Example usage
    String booking = bookHotel(300, 1, 5);
    System.out.println(booking);
  }
}


