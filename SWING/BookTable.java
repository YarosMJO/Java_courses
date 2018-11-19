package SWING;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BookTable {

    public static void main(String arg[]) {
        JFrame frame = new JFrame("Frame");
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        BookTableModel btm = new BookTableModel();
        JTable bookTable = new JTable(btm);
        JScrollPane bookTableScrollPage = new JScrollPane(bookTable);// добавляємо скрол
        bookTableScrollPage.setPreferredSize(new Dimension(400, 700));

        String[] str = new String[4];//на кожну частину масиву rowTable розміщається елемент масиву з даними
        str[0] = "0";
        str[1] = "назва книги";
        str[2] = "542662332";
        str[3] = "опис книги";
        for (int i = 0; i < 100; i++) {
          btm.addData(str);  //4 частини одного рядка в кожному стовпці
        }

        
        JButton addButton = new JButton("Добавити");
        JButton deleteButton = new JButton("Видалити виділене");
        JButton clearButton = new JButton("Очистити все");

        frame.add(bookTableScrollPage, new GridBagConstraints(0, 0, 3, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0));
        frame.add(addButton, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        frame.add(deleteButton, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        frame.add(clearButton, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        frame.setVisible(true);
        frame.pack();

    }
}
