public class RunnableInterfaceThread implements Runnable
{

    public void run()
    {
        System.out.println("Started a thread");
    }
    public static void main(String args[])
    {
        System.out.println("Starting thread");

        Thread t=new Thread();
        t.run();
    }
}