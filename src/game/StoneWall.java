package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class StoneWall {
	int swx;
	int swy;
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
	}
}