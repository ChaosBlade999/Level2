package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	static public int apx=0;
	static public int apy=0;
	int ax=0;
	int ay=0;
	Player go=new Player(900,550,50,50,0,0,0,0);
	StoneWall sw=new StoneWall(100,100);
	StoneWall sw1=new StoneWall(150,100);
	StoneWall sw2=new StoneWall(200,100);
	StoneWall sw3=new StoneWall(200,150);
	StoneWall sw4=new StoneWall(200,200);
	WoodWall ww=new WoodWall(ax+100,ay+100);
	GamePanel(){
	Timer t=new Timer(48,this);
	t.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		sw.draw(g);
		sw1.draw(g);
		sw2.draw(g);
		sw3.draw(g);
		sw4.draw(g);
		ww.draw(g);
		go.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean colliding;
		// TODO Auto-generated method stub
		repaint();
		go.update();
		ax+=apx;
		ay+=apy;
		do{
			colliding=false;
		if(sw.update(ax, ay)||sw1.update(ax, ay)||sw2.update(ax, ay)||sw3.update(ax, ay)||sw4.update(ax, ay)){
			colliding=true;
			if(apx>0){
				ax--;
			}else if(apx<0){
				ax++;
			}
			if(apy>0){
				ay--;
			}else if(apy<0){
				ay++;
			}
		}
		}while(colliding);
		ww=new WoodWall(ax+150,ay+150);
	}
}