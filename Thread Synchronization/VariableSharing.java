public class VariableSharing {
    private int variable;
    public static void main(String args[])
    {
        new VariableSharing();
    }

    public VariableSharing() {
        variable=1;

        Controller c1=new Controller("COCO", 10);
        Controller c2=new Controller("APPLE", 10);

        c1.start();
        c2.start();


        try
        {
            c1.join();
            c2.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Value = "+variable);
    }



    
    class Controller extends Thread
    {
        private String val="";
        int n;

        public Controller(String s,int n) {
            this.n=n;
            this.val=s;
        }


        public synchronized void run()
        {
            for(int i=0;i<n;i++)
            {
                repeater();
            }
        }

        void repeater()
        {
            //String repeat=val+" "+variable;
            //System.out.println(repeat);
            System.out.println(val+" read variable as "+variable);
            variable++;
            System.out.println(val+" modified variable to "+variable);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    
}

