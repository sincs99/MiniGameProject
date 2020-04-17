package view;

import gameminiproject.gameController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Shape;
import model.gameModel;

public class gameGrid {

	public static final int DISC_SIZE = 60;
	protected static Pane gameRoot = new Pane();

	protected static Pane discPane = new Pane();

	public static Parent createBoard() {

		discPane.getChildren().clear();
		gameRoot.getChildren().clear();

		gameRoot.getChildren().add(discPane);

		Shape boardShape = gameModel.buildBoard();
		gameRoot.getChildren().add(boardShape);
		gameRoot.getChildren().addAll(gameModel.createCol());

		gameRoot.setPadding(new Insets(10, 10, 10, 10));

		gameRoot.setPrefWidth(400);

		return gameRoot;
	}

}
