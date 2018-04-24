package GameState;

import java.util.ArrayList;

public class GameStateManager {
	
	private static ArrayList<GameState> gameStates;
	private static int currentState;
	
	public static final int MENUSTATE = 0;
	public static final int LEVEL1STATE = 1;
	public static final int HELPSTATE = 2;
	public static final int CREDITSSTATE = 3;
	
	public GameStateManager() {
		
		gameStates = new ArrayList<GameState>();
		
		currentState = MENUSTATE;
		gameStates.add(new MenuState(this));
		gameStates.add(new Level1State(this));
		gameStates.add(new HelpState(this));
		gameStates.add(new CreditsState(this));
	}
	
	public static void setState(int state) {
		currentState = state;
		gameStates.get(currentState).init();
	}
	
	public void update() {
		gameStates.get(currentState).update();
	}
	
	public void draw(java.awt.Graphics2D g) {
		gameStates.get(currentState).draw(g);
	}
	
	public void keyPressed(int k) {
		gameStates.get(currentState).keyPressed(k);
	}
	
	public void keyReleased(int k) {
		gameStates.get(currentState).keyReleased(k);
	}

}









