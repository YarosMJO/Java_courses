package SWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FLow_Layout {
      public static void main(String args[]){
        
    JFrame frame = new JFrame("My first frame");
    
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,400);
       frame.setLocationRelativeTo(null);
       frame.setLayout( new BorderLayout());
       
         JTextField TextField = new JTextField(10);
       JPanel panel = new JPanel(new FlowLayout());
       panel.setPreferredSize(new Dimension(100,50));
       JButton button = new JButton("The button");
       JButton button1 = new JButton("The button1");
       JButton button2 = new JButton("The button2");
       JButton button3 = new JButton("The button3");
      
       panel.setBackground(Color.orange);
       panel.add(button);
       panel.add(button1);
       panel.add(button2);
       panel.add(button3);
       panel.add(TextField);
      
       frame.add(panel,BorderLayout.SOUTH);
      
      
      
//          JButton []buttons=new JButton[11];
//       for(int i=0;i<buttons.length;i++){
//           buttons[i]=new JButton(String.valueOf(i));
//           frame.add(buttons[i]);
//       }  
       frame.setVisible(true);
      }
}
