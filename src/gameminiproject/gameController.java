package gameminiproject;

import javafx.scene.shape.Shape;
import model.gameModel;
import player.Cpu;
import player.Player;
import view.gameView;

public class gameController {

	private gameView view;
	private gameModel model;
	
	
	
	protected Player player;
	protected Cpu cpu;
	
	
	
	
	
	public gameController(gameView view, gameModel model) {
		this.view = view;
		this.model = model;
	}
	
	

}
