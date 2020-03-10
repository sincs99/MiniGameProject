package gameminiproject;

import model.gameModel;
import view.gameView;

public class gameController {

	private gameView view;
	private gameModel model;
	
	
	
	public gameController(gameView view, gameModel model) {
		this.view = view;
		this.model = model;
	}

}
