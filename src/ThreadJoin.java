public class ThreadJoin extends Thread {
    static Thread mainthread;
    public void run()
    {
        try {
            mainthread.join();
            for(int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+"-" + i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        mainthread=Thread.currentThread();
        ThreadJoin t=new ThreadJoin();
        t.start();
        //t.join();  used if it wants to follow the thread-0 first
        try
        {
            for(int i = 1; i <= 5; i++) {
                System.out.println("main thread-"+i);
                Thread.sleep(1000);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
