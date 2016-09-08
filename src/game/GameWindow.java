package game;

import javax.swing.JFrame;

public class GameWindow {
	JFrame frame=new JFrame();
	GamePanel panel=new GamePanel();
	public static void main(String[] args) {
		new GameWindow();
	}
	GameWindow(){
		frame.setVisible(true);
		frame.add(panel);
	}
}

