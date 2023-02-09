public class Polymorphism {
    void run()
    {
        System.out.println("running");
    }
}
class Bike extends Polymorphism
{
    void run()
    {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.run();
    }
}

