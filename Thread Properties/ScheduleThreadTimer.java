
import java.util.TimerTask;
import java.util.*;

public class ScheduleThreadTimer {
    public static void main(String[] args) {
        System.out.println("Schedule Thread Timer");


        Timer timer=new Timer();
        TaskHandler task=new TaskHandler(timer);

        timer.schedule(task, 5000);

        for(int i=0;i<10;i++)
        {
            System.out.println("Main task");
        }
    }
}


class TaskHandler extends TimerTask
{
    Timer timer;
    public TaskHandler(Timer timer)
    {
        this.timer=timer;
    }

    void repeater()
    {
        System.out.println("Timer Task");
    }

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            repeater();
        }
        timer.cancel();

    }
}
