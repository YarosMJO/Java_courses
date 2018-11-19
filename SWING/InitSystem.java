package SWING;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InitSystem {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Initialization...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel Login_label = new JLabel("Login");
        JLabel Password_label = new JLabel("Password");
        JButton Login_button = new JButton("Login in");
        JButton Registration_button = new JButton("Registration");
        JTextField Login_textField = new JTextField(15);
        JPasswordField Password_field = new JPasswordField(15);

//    GridBagConstraints c= new GridBagConstraints();//мееджер розстановки 
//    c.gridx=0;//розташування
//    c.gridy=0;
//    c.gridheight=1;//параметри
//    c.gridwidth=1;
//    c.weightx=0.0;//розтягнення по x i y, параметри збільшення елемента.Краще не міняти.
//    c.weighty=0.9;
//    c.anchor=GridBagConstraints.NORTH;//компонент буде розташований на півночі
//    //c.fill=GridBagConstraints.BOTH;по всій області обєкт буде розміщатись
//    c.fill=GridBagConstraints.HORIZONTAL;// горизонтальна розстановка компонента
//    c.insets= new Insets(2,2,2,2);//top,left,bottom,right.відстань від одного компонента до іншого
//    c.ipadx=0;//максимальне зменшення компонента
//    c.ipady=0;
//    frame.add(Login_button,c); 
        
        //short version
        frame.add(Login_label, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Login_textField, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Password_label, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Password_field, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Login_button, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.add(Registration_button, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.pack();

        frame.setVisible(true);
    }

    
}
