package SWING;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 2269971701250845501L;
    private String title;
    private Dimension d;
    private JTextField textField1 = new JTextField("");
    private JTextField textField2 = new JTextField("");
    private JButton MyButton1 = new JButton("MyButton1");
     private JButton MyButton2 = new JButton("MyButton2");
    private JLabel label = new JLabel();

    public MainFrame(String title, Dimension d) {
        this.title = title;
        this.d = d;

    }

    public void init() {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(d);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        add(textField1, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        add(textField2, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        add(MyButton1, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));
        
        add(MyButton2, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));
        
        add(label, new GridBagConstraints(1, 2, 2, 2, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));
        pack();

        setVisible(true);
        MyButton1.addActionListener(new ButtonActionListener());
        MyButton2.addActionListener(new ButtonActionListener());

    }

    public class ButtonActionListener implements ActionListener {
    String a,b,ButTEXT;
    int count=0;
        @Override
        public void actionPerformed(ActionEvent e) {
          ButTEXT=  ((JButton )e.getSource()).getText();
            b= textField2.getText();
            a= textField1.getText();
           textField2.setText(a);
           textField1.setText(b);
           count++;
            label.setText(String.valueOf(count+" "+ButTEXT));
          
       }

    }
}
