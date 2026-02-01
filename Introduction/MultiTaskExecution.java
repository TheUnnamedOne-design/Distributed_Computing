public class MultiTaskExecution {

    
    public static void main(String argsp[])
    {
        Executor exec=new Executor("UnnamedOne", 10);

        exec.start();
        int n=10;
        for(int i=0;i<n;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            printer();
        }
    }

    public static void printer()
    {
        System.out.println("BlaBlaBla");
    }



}

class Executor extends Thread
{
    private String s;
    private int x;

    public Executor(String v,int xv)
    {
        s=v;
        x=xv;
    }

    public void run()
    {
        for(int i=0;i<x;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(s);
        }
    }
}
