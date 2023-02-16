import java.lang.*;
public class CreatingThread extends Thread {
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        CreatingThread obj=new CreatingThread();
        obj.start();

    }
}
