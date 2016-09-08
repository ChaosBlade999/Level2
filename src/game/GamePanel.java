package game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	int xm;
	int ym;
	GameObject go=new GameObject(400,100,50,50,xm,ym,0,0);
	GamePanel(){
	Timer t=new Timer(5,this);
	t.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		go.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		go.update();
	}
	public void move(){
		xm=1;
		System.out.println("wc");
	}
}
