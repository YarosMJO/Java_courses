package SWING;

import com.sun.jndi.ldap.Connection;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class BookTableModel extends AbstractTableModel {

    private  int columnCount = 4;
    private ArrayList<String[]> dataArrayList;

    public BookTableModel() {
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }

    }
    @Override
     public int getRowCount() {
        return dataArrayList.size();

    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    @Override
    public String getColumnName(int ColumnIndex) {
        switch (ColumnIndex) {
            case 0:return "#id";
            case 1:return "title";
            case 2:return "isbn";
            case 3:return "description";

        }
        return null;

    }

    public void addData(String[] row) {
        String[] rowTable = new String[getColumnCount()];//таблиця розбивається на 4 колонки , тобто горизонтальний рядок розбитий на 4 частини.
        rowTable = row;
        dataArrayList.add(rowTable);//дані будуть записуватися в ту кількість колонок яку ми передаємо(rowTable);
       
    }
//    public void addData(Connection connect){
//       
//    }

}