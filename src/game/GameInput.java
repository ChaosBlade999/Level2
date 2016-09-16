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
			Player.yi=-1;
			Player.r=0;
		}
		if(e.getKeyChar()=='s'||e.getKeyChar()=='S'){
			Player.yi=1;
			Player.r=Math.PI;
		}
		if(e.getKeyChar()=='d'||e.getKeyChar()=='D'){
			Player.xi=1;
			Player.r=Math.PI/2;
		}
		if(e.getKeyChar()=='a'||e.getKeyChar()=='A'){
			Player.xi=-1;
			Player.r=Math.PI*1.5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		Player.xi=0;
		Player.yi=0;
	}

}
