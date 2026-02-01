public class ThreadGroupDemo {
    public static void main(String agrs[])
    {
        Runnable task=new Task();

        ThreadGroup tg1=new ThreadGroup("GP1");
        Thread t1=new Thread(tg1,task,"T1");
        Thread t2=new Thread(tg1,task,"T2");
        Thread t3=new Thread(tg1,task,"T3");
        
        ThreadGroup tg2=new ThreadGroup("GP2");
        Thread t4=new Thread(tg2,task,"T4");
        Thread t5=new Thread(tg2,task,"T5");
        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();

    }
}


class Task implements Runnable
{
    public void run()
    {
        System.out.println("Thread "+Thread.currentThread().getName()+" belonging to group "+Thread.currentThread().getThreadGroup().getName()+" is executing the current task");
    }
}