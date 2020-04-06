package view;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
	private BorderPane gameRoot;
	private BorderPane homeRoot;
	private Scene scene;

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

		gameRoot = new BorderPane();
		homeRoot = new BorderPane();

		VBox player2 = new VBox(10);
		VBox player1 = new VBox(10);
		
		player1.setPadding(new Insets(10,10,10,10));
		player2.setPadding(new Insets(10,10,10,10));

		centerPane = new StackPane();

		// BorderPane homeScreen = new BorderPane();

		// Labels

		this.lblplayer1 = new Label();
		this.lblplayer1.setId("playerText");

		this.lblplayer2 = new Label("Player 2");
		this.lblplayer2.setId("playerText");

		// Building the Boxes

		player1.getChildren().addAll(lblplayer1);
		player1.setPrefWidth(200);
		

		player2.getChildren().addAll(lblplayer2);
		player2.setPrefWidth(200);

		// centerPane.getChildren().add(gameGrid.createBoard());

		// Setting root Objects

		homeRoot.setCenter(HomeScreen.getHomeScreen().buildHomeScreen());
		homeRoot.setBottom(buttonView.getButtonView().buttonStartViewBuilder());
		homeRoot.setPadding(new Insets(0, 0, 10, 0));

		gameRoot.setLeft(player1);
		gameRoot.setRight(player2);
		gameRoot.setBottom(buttonView.getButtonView().buttonGameViewBuilder());

		gameRoot.setCenter(gameGrid.createBoard());
		homeRoot.setId("background_home");

		// TODO: idk why its not working -_-
		BorderPane.setAlignment(centerPane, Pos.BOTTOM_CENTER);

		gameRoot.setTop(menuBar);

		gameRoot.setPadding(new Insets(0, 0, 10, 0));

		// Setting Scene

		scene = new Scene(gameRoot, 900, 500);
		Scene homeScene = new Scene(homeRoot, 900, 500);
		
		
		
		homeScene.getStylesheets().add(getClass().getResource("/resources/Stylesheet.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("/resources/Stylesheet.css").toExternalForm());
		
		stage.setScene(homeScene);
//		buttonView.getBtnNewGame().setOnAction(e->{
//			System.out.println("Fired");
//			//stage.setScene(scene);
//		});

		stage.setTitle("four in a row");
		stage.setResizable(false);
		stage.initStyle(StageStyle.UNDECORATED);

	}

	public void changeScene() {
		stage.setScene(scene);
		stage.show();
	}

	public void start() {
		stage.show();

	}

	public topMenuBar getMenuBar() {
		return menuBar;
	}

	public BorderPane getRoot() {
		return gameRoot;
	}

	public void setRoot(BorderPane root) {
		this.gameRoot = root;
	}

	public void setCenterPane(StackPane centerPane) {
		this.centerPane = centerPane;
	}

	public StackPane getCenterPane() {
		return centerPane;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public BorderPane getGameRoot() {
		return gameRoot;
	}

	public void setGameRoot(BorderPane gameRoot) {
		this.gameRoot = gameRoot;
	}

	public BorderPane getHomeRoot() {
		return homeRoot;
	}

	public void setHomeRoot(BorderPane homeRoot) {
		this.homeRoot = homeRoot;
	}

	public Label getLblplayer1() {
		return lblplayer1;
	}

	public void setLblplayer1(Label lblplayer1) {
		lblplayer1 = lblplayer1;
	}

	public Label getLblplayer2() {
		return lblplayer2;
	}

	public void setLblplayer2(Label lblplayer2) {
		lblplayer2 = lblplayer2;
	}

}
