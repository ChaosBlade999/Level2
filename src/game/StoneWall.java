package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class StoneWall {
	int swx;
	int swy;
	protected Rectangle collision=new Rectangle(swx,swy,50,50); 
	BufferedImage image;
	StoneWall(int swox, int swoy) {
		try {
		image = ImageIO.read(this.getClass().getResourceAsStream("/Resources/StoneWall.png"));
		} catch (Exception e) {
			System.err.println("There was an error loading your image.");
		}
		swx = swox;
		swy = swoy;
	}
	void draw(Graphics g){
		g.drawImage(image, swx,swy,50,50,null);
		collision.setBounds(swx, swy, 50, 50);
		if(collision.intersects(Player.pcollision)){
			System.out.println("Wow!!!");
		}
	}
}