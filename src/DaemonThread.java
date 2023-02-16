public class DaemonThread extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("my daemon thread");
    }
    public static void main(String[] args) {
        System.out.println("main thread");
      DaemonThread t=new DaemonThread();
      t.setDaemon(true);
      t.start();
    }
}
