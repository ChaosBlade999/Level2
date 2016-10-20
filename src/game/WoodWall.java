package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class WoodWall {
	int wwx;
	int wwy;
	BufferedImage image;
	WoodWall(int swox, int swoy) {
		try {
		image = ImageIO.read(this.getClass().getResourceAsStream("/Resources/WoodWall.png"));
		} catch (Exception e) {
			System.err.println("There was an error loading your image.");
		}
		wwx = swox;
		wwy = swoy;
	}
	void draw(Graphics g){
		g.drawImage(image, wwx,wwy,50,50,null);
	}
}