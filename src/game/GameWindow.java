package game;

import javax.swing.JFrame;

public class GameWindow {
	public static final int width = 1900;
	public static final int height = 1200;
	JFrame frame = new JFrame();
	GamePanel panel = new GamePanel();
	public static GameInput gi = new GameInput();

	public static void main(String[] args) {
		new GameWindow();
	}

	GameWindow() {
		frame.setVisible(true);
		frame.add(panel);
		frame.addKeyListener(gi);
		frame.addMouseListener(gi);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(width, height);
	}
}