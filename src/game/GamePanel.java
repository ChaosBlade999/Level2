package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{

	Player go=new Player(400,100,50,50,0,0,0,0);
	StoneWall sw=new StoneWall(100,100);
	GamePanel(){
	this.setBorder(BorderFactory.createLineBorder(Color.black));
	Timer t=new Timer(5,this);
	t.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		go.draw(g);
		sw.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		go.update();
	}
}