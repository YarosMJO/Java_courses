import javax.swing.*;
public class Main {

	public static void main(String[] args) {
	JFrame f= new JFrame("Street Racing");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(1200,550);
	f.add(new Road());
	f.setVisible(true);	
	
	}

}
