package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Player {
	int x;
	int y;
	int w;
	int h;
	static int xi;
	static int yi;
	int wi;
	int hi;
	static double r=0;
	BufferedImage image;
	public static Rectangle pcollision=new Rectangle(xi,yi,100,100); 
	Player(int ox,int oy,int ow,int oh, int oxi,int oyi,int owi,int ohi){
		try
		{
		image = ImageIO.read(this.getClass().getResourceAsStream("/Resources/Player.png"));
		}
		catch(Exception e)
		{
			System.err.println("There was an error loading your image.");
		} 
		x=ox;
		y=oy;
		w=ow;
		h=oh;
		xi=oxi;
		yi=oyi;
		wi=owi;
		hi=ohi;
	}
	void draw(Graphics g){
		AffineTransform at=new AffineTransform();
		Graphics2D g2=(Graphics2D) g;
		at.rotate(r,x+(50/2),y+(50/2));
		g2.setTransform(at);
		g2.drawImage(image, x,y,50,50,null);
		at.rotate(-r,x+(50/2),y+(50/2));
		g2.setTransform(at);
	}
	void update(){
		x+=xi;
		y+=yi;
		w+=wi;
		h+=hi;
	}

}
