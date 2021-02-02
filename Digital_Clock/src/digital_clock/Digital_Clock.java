package digital_clock;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Digital_Clock extends JFrame{
    JLabel jlabClock;
    ClockThread ct;
    public Digital_Clock()
    {
       jlabClock = new JLabel("");
       setLayout(new FlowLayout());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jlabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,30));
       jlabClock.setOpaque(true);
       jlabClock.setBackground(Color.CYAN);
       jlabClock.setForeground(Color.BLUE);
       
       add(jlabClock);
       setSize(500,100);
       setLocationRelativeTo(null);
          ct = new ClockThread(this);
       setVisible(true);
    
       
       
    }

    public static void main(String[] args) {
new Digital_Clock();
    }
    
}
