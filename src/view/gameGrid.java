package view;

import gameminiproject.gameController;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import model.gameModel;

public class gameGrid {
	
	public static final int DISC_SIZE = 60;
	
	private static Pane disc = new Pane();
	
	public static Parent createBoard() {
		Pane gameRoot = new Pane();
		gameRoot.getChildren().add(disc);
		
		Shape boardShape = gameModel.buildBoard();
		gameRoot.getChildren().add(boardShape);
		gameRoot.getChildren().addAll(gameModel.createCol());
	
		return gameRoot;
	}

}
