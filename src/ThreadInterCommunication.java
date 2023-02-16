class TotalEarnings extends Thread
{
    int total=0;
    public void run()
    {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class ThreadInterCommunication {
    public static void main(String[] args) throws InterruptedException
    {

        TotalEarnings te = new TotalEarnings();
        te.start();
        synchronized (te) {
                 te.wait();
            System.out.println("total earning : " + te.total);
        }
    }
}
