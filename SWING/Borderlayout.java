package SWING;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Borderlayout {
    public static void main(String args[]){
        
    JFrame frame = new JFrame("My first frame");
    
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,400);
       frame.setLocationRelativeTo(null);
       frame.setLayout( new BorderLayout());
       
       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JPanel panel3 = new JPanel();
       JPanel panel4 = new JPanel();
       JPanel panel5 = new JPanel();
  
       
       panel1.setBackground(Color.red);
       panel2.setBackground(Color.green);
       panel3.setBackground(Color.yellow);
       panel4.setBackground(Color.blue);
       panel5.setBackground(Color.magenta);
   
       panel5.setLayout(new BorderLayout());//!!!!!********!!!!!
       
       frame.add(panel1,BorderLayout.PAGE_START);
       frame.add(panel2,BorderLayout.PAGE_END);
       frame.add(panel3,BorderLayout.LINE_END);
       frame.add(panel4,BorderLayout.LINE_START);
       frame.add(panel5,BorderLayout.CENTER);
       JButton button =new JButton("Pop up!");
       panel5.add(button,BorderLayout.NORTH);
      
     
     
          frame.setVisible(true);
}
         
}
