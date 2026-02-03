import java.util.*;
public class UnSynchronisedModifier
{
    public static void main(String args[])
    {
        Controller c1,c2;
        c1=new Controller("ABC");
        c2=new Controller("XYZ");

        c1.start();
        c2.start();
    }
}

class Controller extends Thread
{
    String s;
    Controller(String t)
    {
        s=t;
    }
    public void run()
    {
        Printer obj=new Printer(s);
        for (int i = 0; i < 10; i++) {
            obj.printer();
        }
    }
}


class Printer
{
    String text="";
    Printer(String s)
    {
        text=s;
    }

    public void printer()
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