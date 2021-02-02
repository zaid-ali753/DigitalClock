
package digital_clock;
import java.lang.Thread;
import java.util.Date;

public class ClockThread extends Thread{
    Digital_Clock dc;
    String time;
    
    public ClockThread(Digital_Clock dc){
        this.dc = dc;
        start();
        
    }
    public void run(){
        while(true)
        {
            time =""+new Date();
            dc.jlabClock.setText(time);
        }
    }
}
