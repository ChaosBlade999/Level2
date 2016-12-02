package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Zombie {
	static int zx;
	static int zy;
	int zw;
	int zh;
	static int zxi;
	static int zyi;
	int zwi;
	int zhi;
	static double r = 0;
	BufferedImage image;
	public static Rectangle pcollision;

	Zombie(int ox, int oy, int ow, int oh, int oxi, int oyi, int owi, int ohi) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("/Resources/Zombie.png"));
		} catch (Exception e) {
			System.err.println("There was an error loading your image.");
		}
		zx = ox;
		zy = oy;
		zw = ow;
		zh = oh;
		zxi = oxi;
		zyi = oyi;
		zwi = owi;
		zhi = ohi;
		pcollision = new Rectangle(zx, zy, 50, 50);
	}

	void draw(Graphics g) {
		AffineTransform at = new AffineTransform();
		Graphics2D g2 = (Graphics2D) g;
		// at.rotate(r, zx + (50 / 2), zy + (50 / 2));
		g2.setTransform(at);
		g2.drawImage(image, zx, zy, 50, 50, null);
		at.rotate(-r, zx + (50 / 2), zy + (50 / 2));
		g2.setTransform(at);
	}

	void update() {
		zx += zxi;
		zy += zyi;
		zw += zwi;
		zh += zhi;
	}

}