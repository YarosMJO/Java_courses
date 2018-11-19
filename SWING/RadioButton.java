package SWING;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton {
    public static void main(String arg[]){
    JFrame frame = new JFrame("My first frame");
    
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,400);
       frame.setLocationRelativeTo(null);
       frame.setLayout( new GridBagLayout());
       
       JRadioButton Radiobutton = new JRadioButton("RadioButton");
       JCheckBox CheckBox = new JCheckBox("CheckBox");
       final JButton button = new JButton("Button");
       
         button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           boolean ft = Radiobutton.isSelected();
            System.out.println("ft="+ft);
        }
    });
       
       
       frame.add(Radiobutton,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
               new Insets(1,1,1,1),0,0));
        frame.add(CheckBox,new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
               new Insets(1,1,1,1),0,0));
        frame.add(button,new GridBagConstraints(0,2,2,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
               new Insets(1,1,1,1),0,0));
        frame.pack();
       
       frame.setVisible(true);
      
}
}
