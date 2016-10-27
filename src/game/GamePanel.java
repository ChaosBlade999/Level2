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
	StoneWall sw=new StoneWall(ax+100,ay+100);
	StoneWall sw1=new StoneWall(ax+150,ay+100);
	StoneWall sw2=new StoneWall(ax+200,ay+100);
	StoneWall sw3=new StoneWall(ax+200,ay+150);
	StoneWall sw4=new StoneWall(ax+200,ay+200);
	WoodWall ww=new WoodWall(ax+100,ay+100);
	GamePanel(){
	Timer t=new Timer(48,this);
	t.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		go.draw(g);
		sw.draw(g);
		sw1.draw(g);
		sw2.draw(g);
		sw3.draw(g);
		sw4.draw(g);
		ww.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		go.update();
		ax+=apx;
		ay+=apy;
		sw=new StoneWall(ax+100,ay+100);
		sw1=new StoneWall(ax+150,ay+100);
		sw2=new StoneWall(ax+200,ay+100);
		sw3=new StoneWall(ax+200,ay+150);
		sw4=new StoneWall(ax+200,ay+200);
		ww=new WoodWall(ax+150,ay+150);
	}
}