package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameInput implements KeyListener{
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()=='w'||e.getKeyChar()=='W'){
			GamePanel.apy=8;
			Player.r=0;
		}
		if(e.getKeyChar()=='s'||e.getKeyChar()=='S'){
			GamePanel.apy=-8;
			Player.r=Math.PI;
		}
		if(e.getKeyChar()=='d'||e.getKeyChar()=='D'){
			GamePanel.apx=-8;
			Player.r=Math.PI/2;
		}
		if(e.getKeyChar()=='a'||e.getKeyChar()=='A'){
			GamePanel.apx=8;
			Player.r=Math.PI*1.5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		GamePanel.apx=0;
		GamePanel.apy=0;
	}
}