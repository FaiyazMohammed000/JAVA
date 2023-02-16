public class ThreadPriority extends Thread {
    public void run()
    {
        System.out.println("child thread");
        System.out.println("child thread priority: "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("main thread old Priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main thread new priority: "+Thread.currentThread().getPriority());
        ThreadPriority t=new ThreadPriority();
        t.setPriority(3);
        t.start();

    }
}
