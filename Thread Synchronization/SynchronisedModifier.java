import java.util.*;
public class SynchronisedModifier
{
    public static void main(String args[])
    {
        Controller c1,c2;
        Printer pr=new Printer();
        c1=new Controller("ABC",pr);
        c2=new Controller("XYZ",pr);

        c1.start();
        c2.start();
    }
}

class Controller extends Thread
{
    String s;
    Printer obj;
    Controller(String t,Printer ob)
    {
        s=t;
        obj=ob;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            obj.printer(s);
        }
    }
}


class Printer
{
    String text="";
    Printer()
    {
        text="";
    }

    public synchronized void printer(String text)
    {
        for(int i=0;i<text.length()-1;i++)
        {
            System.out.print(text.charAt(i));
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(text.charAt(text.length()-1));
    }
}