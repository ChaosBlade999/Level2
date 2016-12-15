package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Player {
	static int aimX;
	static int aimY;
	static int x;
	static int y;
	int w;
	int h;
	static int xi;
	static int yi;
	int wi;
	int hi;
	static double r = 0;
	BufferedImage image;
	public static Rectangle pcollision;

	Player(int ox, int oy, int ow, int oh, int oxi, int oyi, int owi, int ohi) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("/Resources/Player.png"));
		} catch (Exception e) {
			System.err.println("There was an error loading your image.");
		}
		x = ox;
		y = oy;
		w = ow;
		h = oh;
		xi = oxi;
		yi = oyi;
		wi = owi;
		hi = ohi;
		pcollision = new Rectangle(x, y, 50, 50);
	}

	void draw(Graphics g) {
		AffineTransform at = new AffineTransform();
		Graphics2D g2 = (Graphics2D) g;
		at.rotate(r, x + (50 / 2), y + (50 / 2));
		g2.setTransform(at);
		g2.drawImage(image, x, y, 50, 50, null);
		at.rotate(-r, x + (50 / 2), y + (50 / 2));
		g2.setTransform(at);
		g.setColor(new Color(213, 196, 77));
		
		if (aimX != 925 && aimY != 575) {
			// compute the slope (b) and intersects x and y of the laser beam

			// Get a list of things the laser can interset (walls, zombies...)

			// For each item in the list
			   // If the object intersects with a rectangle (925,575) x (aimX, aimY) then
					// For both horizontal lines
						// px = b * p1y, if p1x <= px <= p2x then px, p1y is a point of intersection
			        // For both vertical lines
						// py = p1x/b, if p1y <= py <= p2y then p1x, py is a point of intersection

			// If the item intersects, keep track of the intersection point an compute the distance

			// Keep track of the intersecting object with the shortest distance, that is what you hit.

			// Make that point the new aimX, aimY
		}
		g.drawLine(925, 575, aimX, aimY);
		aimX = 925;
		aimY = 575;
	}

	void update() {
		x += xi;
		y += yi;
		w += wi;
		h += hi;
	}

}
