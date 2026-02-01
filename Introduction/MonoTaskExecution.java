public class MonoTaskExecution {

    
    public static void main(String argsp[])
    {
        Executor exec=new Executor("UnnamedOne", 5);
        printer();
        printer();
        exec.run();
        int n=3;
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
        }
        printer();
    }

    public static void printer()
    {
        System.out.println("BlaBlaBla");
    }



}

class Executor
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
