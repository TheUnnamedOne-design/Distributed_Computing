public class JoinOperation {
    public static void main(String args[])
    {
        Executor ex1=new Executor("UnnamedOne");
        Executor ex2=new Executor("KnownOne");

        ex1.start();


        try
        {
            ex1.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        ex2.start();
    }
}


class Executor extends Thread
{
    String s;

    public Executor(String s) {
        this.s=s;
    }

    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(s);
        }
    }
    
}