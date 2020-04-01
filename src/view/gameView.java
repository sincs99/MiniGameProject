package view;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.gameModel;

public class gameView {

	private Stage stage;
	private gameModel model;
	private topMenuBar menuBar;
	private BorderPane root;
	private StackPane centerPane;

	protected Label lblplayer1, lblplayer2, lblcards1, lblcards2;

	public gameView(Stage stage, gameModel model) {
		this.stage = stage;
		this.model = model;
		this.menuBar = new topMenuBar();

		this.lblplayer1 = lblplayer1;
		this.lblplayer2 = lblplayer2;
		this.lblcards1 = lblcards1;
		this.lblcards2 = lblcards2;

		// Boxing

		root = new BorderPane();
		
		VBox player2 = new VBox();
		VBox player1 = new VBox();
		
		centerPane = new StackPane();
		
		

		// Labels

		
		this.lblplayer1 = new Label("Player 1");
		this.lblplayer1.setId("playerText");
		
		this.lblplayer2 = new Label("Player 2");
		this.lblplayer2.setId("playerText");

		// Building the Boxes
		
		player1.getChildren().addAll(lblplayer1);
		player1.setPrefWidth(200);


		player2.getChildren().addAll(lblplayer2);
		player2.setPrefWidth(200);
		
		//centerPane.getChildren().add(gameGrid.createBoard());

		// Setting root Objects

		root.setLeft(player1);
		root.setRight(player2);
		root.setBottom(buttonView.buttonViewBuilder());

		root.setCenter(gameGrid.createBoard());
		
		//TODO: idk why its not working -_-
		BorderPane.setAlignment(centerPane, Pos.BOTTOM_CENTER);
		
		root.setTop(menuBar);

		root.setPadding(new Insets(0, 0, 10, 0));

		// Setting Scene

		Scene scene = new Scene(root, 900, 500);
	
		scene.getStylesheets().add(getClass().getResource("/resources/Stylesheet.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("four in a row");
		stage.setResizable(false);
		stage.initStyle(StageStyle.UNDECORATED);

	}

	public void start() {
		stage.show();

	}

	public topMenuBar getMenuBar() {
		return menuBar;
	}

	public BorderPane getRoot() {
		return root;
	}

	public void setRoot(BorderPane root) {
		this.root = root;
	}
	
	public void setCenterPane(StackPane centerPane) {
		this.centerPane = centerPane;
	}
	
	public StackPane getCenterPane() {
		return centerPane;
	}

}
