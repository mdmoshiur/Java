package GameState;

import TileMap.*;

import java.awt.*;
import java.awt.event.KeyEvent;


public class HelpState extends GameState {
	
	private Background bg;
	private Color HelpColor;
	private Font HelpFont;
	
	private Font font;
	
	public HelpState(GameStateManager gsm) {
		
		this.gsm = gsm;
		
		try {
			
			bg = new Background("/Backgrounds/menubg.gif", 1);
			bg.setVector(-0.1, 0);
			
			HelpColor = new Color(128, 0, 0);
			HelpFont = new Font(
					"forte",
					Font.PLAIN,
					14);
			
			font = new Font("Arial", Font.PLAIN, 14);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void init() {}
	
	public void update() {
		bg.update();
	}
	
	public void draw(Graphics2D g) {
		
		// draw bg
		bg.draw(g);
		
		// draw help
		g.setColor(HelpColor);
		g.setFont(HelpFont);
		g.drawString("MOVEMENT ARROW KEYS", 55, 80);
		g.drawString("FOR JUMPING  'W'", 77, 100);
		g.drawString("FOR GLIDING  'E'", 77, 120);
		g.drawString("FIREBALE ATTACK  'F'", 65, 140);
		g.drawString("SCRATCHING ATTACK  'R'",50, 160);
		g.drawString("PRESS BACKSPACE TO BACK",45, 200);
		
	}
	
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_BACK_SPACE) GameStateManager.setState(0);
	}
	public void keyReleased(int k) {}
	
	
}



