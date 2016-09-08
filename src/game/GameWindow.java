package game;

import javax.swing.JFrame;

public class GameWindow {
	public static final int width=800;
	public static final int height=400;
	JFrame frame=new JFrame();
	GamePanel panel=new GamePanel();
	GameInput gi=new GameInput();
	public static void main(String[] args) {
		new GameWindow();
	}
	GameWindow(){
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(width, height);
		frame.addKeyListener(gi);
	}
}