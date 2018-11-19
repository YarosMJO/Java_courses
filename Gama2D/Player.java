import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	public Rectangle getRect(){
		return new Rectangle(x, y, 110,80);
	}
	public static final int max_v = 60;
	public static final int max_top = 50;
	public static final int max_bottom = 320;
	
	Image img_c = new ImageIcon(getClass().getClassLoader().getResource("res/player2.png")).getImage();
	Image img_l = new ImageIcon(getClass().getClassLoader().getResource("res/pl_left.png")).getImage();
	Image img_r = new ImageIcon(getClass().getClassLoader().getResource("res/pl_right.png")).getImage();
	Image img = img_c;
	int v = 0;
	int dv = 0;
	int s = 0;
	int layer1 = 0;
	int layer2 = 1360;
	int x = 10;
	int y = 90;
	int dy = 0;

	public void move() {
		s += v;
		v += dv;
		y -= dy;
		if (v <= 0)
			v = 0;
		if (v >= max_v)
			v = max_v;
		if (y <= max_top)
			y = max_top;
		if (y >= max_bottom)
			y = max_bottom;
		if (layer2 - v <= 0) {

			layer1 = 0;
			layer2 = 1360;
		} else {
			layer1 -= v;
			layer2 -= v;
		}
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_RIGHT) {
			dv = 3;
		}
		if (key == KeyEvent.VK_LEFT) {
			dv = -2;
		}
		if (key == KeyEvent.VK_UP) {
			dy = 6;
			img = img_l;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = -6;
			img = img_r;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
			dv = 0;
			img = img_c;
		}
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
			dy = 0;
			img = img_c;
		}
	}
}
