class Racer extends Thread
{
    String name;
    int pos=0;

    public Racer(String name) 
    {
        this.name=name;
        this.pos=0;
    }

    public void run()
    {
        int b=6;
        int a=1;
        for(int i=1;i<=10;i++)
        {
            pos=i*100;
            System.out.println(name+" : "+pos);
            try
            {
                Thread.sleep((int)(Math.random() * (b - a + 1))*1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadRaceSimulation
{

    public static void main(String[] args) {

        Racer r1=new Racer("UnnamedOne");
        Racer r2=new Racer("KnownOne");

        r1.start();
        r2.start();
        
    }
    
    
}
