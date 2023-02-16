import java.lang.*;
public class CreatingThread2 implements Runnable {
    public void run()
    {
        System.out.println("Threading is running");
    }

    public static void main(String[] args) {
        CreatingThread2 obj1=new CreatingThread2();
        Thread obj2=new Thread(obj1);
        obj2.start();
    }
}


