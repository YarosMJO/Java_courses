
package SWING;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayout {
    public static void main(String arg[]){
    JFrame frame = new JFrame("My first frame");
    
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,400);
       frame.setLocationRelativeTo(null);
       frame.setLayout( new BorderLayout());
       JPanel panelC = new JPanel(new java.awt.GridLayout(3,3));
       JPanel panelN = new JPanel(new BorderLayout());
        
        
      JButton button1 = new JButton("1");
      JButton button2 = new JButton("2");
      JButton button3 = new JButton("3");
      JButton button4 = new JButton("4");
      JButton button5 = new JButton("5");
      JButton button6 = new JButton("6");
      JButton button7 = new JButton("7");
      JButton button8 = new JButton("8");
      JButton button9 = new JButton("9");
      JButton button0= new JButton("0");
      
      JTextField field=new JTextField(10);
     
        panelC.add(button1);
        panelC.add(button2);
        panelC.add(button3);
        panelC.add(button4);
        panelC.add(button5);
        panelC.add(button6);
        panelC.add(button7);
        panelC.add(button8);
        panelC.add(button9);
        panelC.add(button0);
        panelN.add(field,BorderLayout.CENTER);
        frame.add(panelN,BorderLayout.NORTH);
        frame.add(panelC,BorderLayout.CENTER);
       
       frame.setVisible(true);
}
}
