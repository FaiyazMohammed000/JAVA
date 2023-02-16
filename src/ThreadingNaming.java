public class ThreadingNaming extends Thread{
    public void run()
    {
        System.out.println("hello");
        System.out.println("Thread name:"+Thread.currentThread().getName());

    }
    public static void main(String[] args) {
        System.out.println("welcome");
        System.out.println("Thread name:"+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        ThreadingNaming t1=new ThreadingNaming();
        t1.setName("Mohammed");
        t1.start();
        ThreadingNaming t2=new ThreadingNaming();
        t2.setName("Faiyaz");
        t2.start();
    }
}

