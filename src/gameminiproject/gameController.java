package gameminiproject;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import model.Disc;
import model.gameModel;
import player.Player1;
import player.Player2;
import view.gameGrid;
import view.gameView;
import view.topMenuBar;

public class gameController extends gameGrid {

	private gameView view;
	private gameModel model;

	protected Player1 player1;
	protected Player2 player2;

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

			
		});
		
		
		view.getMenuBar().getColor1().setOnAction(e->{
			Disc.setC1(Color.RED);
			this.refreshGameBoard();
		});
		
		view.getMenuBar().getColor2().setOnAction(e->{
			Disc.setC1(Color.BLUE);
			this.refreshGameBoard();
		});
		
		view.getMenuBar().getColor3().setOnAction(e->{
			Disc.setC2(Color.YELLOW);
			this.refreshGameBoard();
		});
		
		view.getMenuBar().getColor4().setOnAction(e->{
			Disc.setC2(Color.GREEN);
			this.refreshGameBoard();
		});
	}

	private void refreshGameBoard() {
		view.getRoot().setCenter(null);
		view.getRoot().setCenter(createBoard());
		//view.getCenterPane().getChildren().add(null);
		//view.getCenterPane().getChildren().add(gameGrid.createBoard());
		
	}

}
