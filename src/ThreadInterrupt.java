public class ThreadInterrupt extends Thread {
    public void run()
    {
        System.out.println(Thread.interrupted()); //changes the result if used twice (true->false)
        try
        {
        for (int i=1;i<=5;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        }
        catch (Exception e)
        {
            System.out.println("Thread Interrupted: "+e);
        }
    }
    public static void main(String[] args) {
        ThreadInterrupt t=new ThreadInterrupt();
        t.start();
        t.interrupt();

    }
}
