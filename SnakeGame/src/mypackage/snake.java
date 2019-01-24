package mypackage;

import javax.swing.JFrame;

public class snake {
	public snake(){
	JFrame frame = new JFrame();	
	GamePanel gamePanel =  new GamePanel();
	
	frame.add(gamePanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("SNAKE");
	
	frame.pack();
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	}
	
	
	public static void main(String args[]){
		new snake();
	}
}
