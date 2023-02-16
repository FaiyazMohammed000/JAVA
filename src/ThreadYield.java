public class ThreadYield extends Thread{
    public void run()
    {
        for(int i=6;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
    public static void main(String[] args) {
        ThreadYield t=new ThreadYield();
        t.start();
        Thread.yield();   //if we want to stop main thread and execute other thread.
        for (int i=1;i<=5;i++)
        {
            System.out.println("main-"+i);
        }

    }
}
