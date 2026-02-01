public class ThreadPriorityProgram {

    public static void main(String[] args) {
        Task t1=new Task("t1");
        Task t2=new Task("t2");


        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
    
}


class Task extends Thread
{
    String s;
    public Task(String s)
    {
        this.s=s;
    }
    public void run()
    {
        for(int i=0;i<=100000000;i++)
        {
            if(i%10000000==0)
                System.out.println("Executed "+i+" steps by "+this.s);
        }
    }
}