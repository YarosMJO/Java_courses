import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy {
	//test  message
		int x;
		int y;
		int v;
		Image img = new ImageIcon(getClass().getClassLoader().getResource("res/player.png")).getImage();
		Road Road;
		public Rectangle getRect(){
			return new Rectangle(x, y, 110,80);
		}
		
		public Enemy(int x, int y, int v,Road Road){
			this.x=x;
			this.y=y;
			this.v=v;
			this.Road=Road;
	}
public void move(){
	x=x-Road.p.v+v;
}


}
