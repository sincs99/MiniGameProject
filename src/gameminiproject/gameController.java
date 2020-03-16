package gameminiproject;

import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import model.gameModel;
import player.Cpu;
import player.Player;
import view.gameGrid;
import view.gameView;
import view.topMenuBar;

public class gameController {

	private gameView view;
	private gameModel model;

	protected Player player;
	protected Cpu cpu;

	public gameController(gameView view, gameModel model) {
		this.view = view;
		this.model = model;

		
		
		view.getMenuBar().getBlue().setOnAction(e -> {
			gameModel.setGameBoard(Color.CORNFLOWERBLUE);

			this.refreshGameBoard();
		});
		
		
		view.getMenuBar().getRed().setOnAction(e -> {
			gameModel.setGameBoard(Color.DARKRED);

			this.refreshGameBoard();
		});

		view.getMenuBar().getExit().setOnAction(e -> {
			Platform.exit();
		});

		view.getMenuBar().getSevenSix().setOnAction(e -> {
			gameModel.setColSize(7);
			gameModel.setRowSize(6);

			this.refreshGameBoard();
		});

		view.getMenuBar().getFourFour().setOnAction(e -> {
			gameModel.setColSize(4);
			gameModel.setRowSize(4);

			this.refreshGameBoard();

			view.getRoot().getCenter().setLayoutY(100);
		});
	}

	private void refreshGameBoard() {
		view.getRoot().setCenter(null);
		view.getRoot().setCenter(gameGrid.createBoard());
	}

}
