
class SynchronizedBlock
{
    int totalSeats=10;
     void bookseats(int seats)
    {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        synchronized (this)
        {
            if(totalSeats>=seats)
            {
                System.out.println(seats+" seats Booked sucessfully");
                totalSeats=totalSeats-seats;
                System.out.println("Total seats: "+totalSeats);
            }
            else {
                System.out.println("sorry seats cannot be booked");
                System.out.println("Total seats: "+totalSeats);
            }
        }
    }
}
 class MovieBookApp extends Thread{
    static SynchronizedBlock b;
    int seats;
    public void run()
    {
        b.bookseats(seats);
    }
    public static void main(String[] args) {
        b=new SynchronizedBlock();
        MovieBookApp faiyaz=new MovieBookApp();
        faiyaz.seats=7;
        faiyaz.start();
        MovieBookApp mohammed=new MovieBookApp();
        mohammed.seats=6;
        mohammed.start();
    }
}

