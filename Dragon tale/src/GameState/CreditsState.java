package GameState;

import TileMap.*;

import java.awt.*;
import java.awt.event.KeyEvent;


public class CreditsState extends GameState {
	
	private Background bg;
	private Color CreditsColor;
	private Font CreditsFont;
	
	private Font font;
	
	public CreditsState(GameStateManager gsm) {
		
		this.gsm = gsm;
		
		try {
			
			bg = new Background("/Backgrounds/menubg.gif", 1);
			bg.setVector(-0.1, 0);
			
			CreditsColor = new Color(100, 100, 100);
			CreditsFont = new Font(
					"Algerian",
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
		g.setColor(CreditsColor);
		g.setFont(CreditsFont);
		g.drawString("MD. MOSHIUR RAHMAN", 65, 80);
		g.drawString("SPECIAL THANKS", 80, 110);
		g.drawString("EMRANA KABIR HASHI MAM", 55, 140);
		g.drawString("PRESS BACKSPACE TO BACK",45, 200);
		
	}
	
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_BACK_SPACE) GameStateManager.setState(0);
	}
	public void keyReleased(int k) {}
	
	
}



