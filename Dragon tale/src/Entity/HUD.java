package Entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import GameState.GameStateManager;

public class HUD {
	
	private Player player;
	
	
	private BufferedImage image;
	private Font font;
	public static final int MENUSTATE = 0;


//	private static final GameStateManager gsm = null;
	
	private Color gameoverColor;
	private Font gameoverFont;


	
	public HUD(Player p) {
		player = p;
		try {
			image = ImageIO.read(
				getClass().getResourceAsStream(
					"/HUD/hud.gif"
				)
			);
			font = new Font("Arial", Font.PLAIN, 14);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics2D g) {
		
		g.drawImage(image, 0, 10, null);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString(
			player.getHealth() + "/" + player.getMaxHealth(),
			30,
			25
		);
		g.drawString(
			player.getFire() / 100 + "/" + player.getMaxFire() / 100,
			30,
			45
		);
		
		
		font = new Font("Berlin Sans FB", Font.PLAIN, 14);
		g.setColor(Color.RED);
		
		 g.drawString("Score : "+ player.getScore(), 250, 20);
		// g.drawString("x: "+ player.getx(),240,30);
		// g.drawString("y: "+ player.gety(),240,40);
		 
	
		 gameoverColor = new Color(128, 0, 0);
		 gameoverFont =new Font("Cooper Black", Font.PLAIN, 28);
		 g.setColor(gameoverColor);
		 g.setFont(gameoverFont);
		 if(player.isDead()==true )
		 {
			 g.drawString("Game Over", 80, 110);
			 player.setgameover();
		 }
				
		if((player.getx()==3170 && player.gety()==200) ){
			 g.drawString("Congratulations", 45, 80);
			 g.drawString("Level 1 Complete", 40, 130);
			 player.setgameover();
		}
			

		 if( player.gety()>= 228) {
			 GameStateManager.setState(1);
		 }
	}
	
	
	
}












