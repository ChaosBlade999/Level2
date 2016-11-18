package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class StoneWall {
	int swx;
	int swy;
	final int xp;
	final int yp;
	Rectangle collision=new Rectangle(swx,swy,50,50); 
	BufferedImage image;
	StoneWall(int swox, int swoy) {
		try {
		image = ImageIO.read(this.getClass().getResourceAsStream("/Resources/StoneWall.png"));
		} catch (Exception e) {
			System.err.println("There was an error loading your image.");
		}
		xp = swox;
		yp = swoy;
	}
	void draw(Graphics g){
		g.drawImage(image, swx,swy,50,50,null);
	}
	public boolean update(int ax, int ay) {
		// TODO Auto-generated method stub
		swx=ax+xp;
		swy=ay+yp;
		collision.setLocation(swx,swy);
		return collision.intersects(Player.pcollision);
	}
}