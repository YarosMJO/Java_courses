package SWING;
import com.sun.javafx.geom.Shape;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import javafx.scene.control.ProgressBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class Swing_ProgBar {
    
    public static void main(String[] args) throws InterruptedException {
        
       JFrame frame = new JFrame("My first frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new GridBagLayout());
       frame.setSize(600,400);
       frame.setLocationRelativeTo(null);
       
       JButton button = new JButton("Button");
       JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
       panel1.setBackground(Color.green);
        panel2.setBackground(Color.yellow);
       
       panel1.add(button);
       frame.add(panel1);
       panel1.add(panel2);
        Component []comp =panel1.getComponents();
        for (int i=0;i<comp.length;i++)
        {
            if (comp[i] instanceof JButton){
                System.out.println("Panel is just here!");
                String titlebutton= ((JButton)comp[i]).getText();
                System.out.println(titlebutton);
            }
            
        }
       
       frame.setVisible(true);
        
     
     /*  JLabel label =new JLabel("Завантаження....");
        JProgressBar PB = new JProgressBar();
        
        PB.setStringPainted(true);
        PB.setIndeterminate(true);
        PB.setMinimum(0);
        PB.setMaximum(100);
        frame.add(PB);
        frame.add(label);
        for(int i=PB.getMinimum();i<=PB.getMaximum();i++){
            Thread.sleep(50);
            PB.setValue(i);
        }
       PB.setIndeterminate(false);
       label.setText("Завантаження завершено!");
       frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
       */
       
       
       
       
    }
    
}
