package main;

import javax.swing.JFrame;

public class Mian {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Simlpe Chess");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		// Add GamePanel to this window
		GamePanel gp = new GamePanel();
		window.add(gp);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gp.launchGame();
	}
}
