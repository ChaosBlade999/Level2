package game;

import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int w;
	int h;
	int xi;
	int yi;
	int wi;
	int hi;
	GameObject(int ox,int oy,int ow,int oh, int oxi,int oyi,int owi,int ohi){
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
		g.setColor(Color.blue);
		g.fillRect(x, y, w, h);
	}
	void update(){
		x+=xi;
		y+=yi;
		w+=wi;
		h+=hi;
	}
}
