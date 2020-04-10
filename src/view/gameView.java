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
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import model.gameModel;
import player.Player;

public class gameView {

	private Stage stage;
	private gameModel model;
	private topMenuBar menuBar;
	private BorderPane gameRoot;
	private BorderPane homeRoot;
	private Scene scene;
	private Label onRow, startText, resultL, resultR, resultFormat;
	private VBox bottomBox, topBox;
	public static final int SPACER_HEIGHT = 10;
	private Region upperSpacer, lowerSpacer;
	private HBox startNameBox, resultBox;

	private StackPane centerPane;


	// Labels moved to Player
	// protected Label lblplayer1, lblplayer2, lblcards1, lblcards2;

	public gameView(Stage stage, gameModel model) {
		this.stage = stage;

		this.model = model;
		this.menuBar = new topMenuBar();

		// Boxing

		gameRoot = new BorderPane();
		homeRoot = new BorderPane();

		// player2 = new VBox(10);
		// player1 = new VBox(10);

		// player1.setPadding(new Insets(10,10,10,10));
		// player2.setPadding(new Insets(10,10,10,10));

		centerPane = new StackPane();

//		// BorderPane homeScreen = new BorderPane();
//
//		// Labels
//
//		this.lblplayer1 = new Label();
//		this.lblplayer1.setId("playerText");
//
//		this.lblplayer2 = new Label();
//		this.lblplayer2.setId("playerText");
//
//		// Building the Boxes
//
//		player1.getChildren().addAll(lblplayer1);
//		player1.getChildren().addAll(Player1.getPlayerView().playerViewBuilder());
//		player1.setPrefWidth(200);
//		
//
//		player2.getChildren().addAll(lblplayer2);
//		player2.setPrefWidth(200);

		// Setting root Objects

		homeRoot.setCenter(HomeScreen.getHomeScreen().buildHomeScreen());
		homeRoot.setBottom(buttonView.getButtonView().buttonStartViewBuilder());
		homeRoot.setPadding(new Insets(0, 0, 10, 0));

		gameRoot.setLeft(player.Player.getPlayerView().playerLeftViewBuilder());
		gameRoot.setRight(player.Player.getPlayerView().playerRightViewBuilder()); // TODO: Playerviews anschauen
		bottomBox = new VBox(10);
		bottomBox.setAlignment(Pos.CENTER);
		


		bottomBox.getChildren().addAll(buttonView.getButtonView().buttonGameViewBuilder());
		gameRoot.setBottom(bottomBox);

		gameRoot.setCenter(gameGrid.createBoard());
		gameRoot.setId("background_game");
		homeRoot.setId("background_home");

		upperSpacer = new Region();
		lowerSpacer = new Region();

		upperSpacer.setPrefHeight(SPACER_HEIGHT);
		lowerSpacer.setPrefHeight(SPACER_HEIGHT);
		topBox = new VBox();
		topBox.setAlignment(Pos.CENTER);
		
		
		//TODO: Build a count only for testing purposes
		Label testLabel = new Label();
		String t = String.valueOf(gameModel.getCountL());
		testLabel.setText(t);
		
		
		testLabel.setId("result");
		
		startNameBox = new HBox();
		resultBox = new HBox();
		

		onRow = new Label();
		startText = new Label(" is first!");
		resultL = new Label("0"); //TODO: Change null
		resultR = new Label("0"); //TODO: Change null
		resultFormat = new Label(" : ");
		resultL.setId("result");
		resultR.setId("result");
		resultFormat.setId("result");
		
		
		resultBox.getChildren().addAll(resultL, resultFormat, resultR);
		resultBox.setAlignment(Pos.CENTER);
		
		
		startNameBox.getChildren().addAll(onRow, startText);
		startNameBox.setAlignment(Pos.CENTER);

		topBox.getChildren().addAll(menuBar, upperSpacer, resultBox, startNameBox, lowerSpacer);

		gameRoot.setTop(topBox);

		gameRoot.setPadding(new Insets(0, 0, 10, 0));

		// Setting Scene

		scene = new Scene(gameRoot, 900, 650);
		Scene homeScene = new Scene(homeRoot, 900, 550);

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

	public Label getOnRow() {
		return onRow;
	}

	public void setOnRow(Label onRow) {
		this.onRow = onRow;
	}

	public Label getStartText() {
		return startText;
	}

	public void setStartText(Label startText) {
		this.startText = startText;
	}

	public Label getResultL() {
		return resultL;
	}

	public void setResultL(Label resultL) {
		this.resultL = resultL;
	}

	public Label getResultR() {
		return resultR;
	}

	public void setResultR(Label resultR) {
		this.resultR = resultR;
	}
	
	
	
	

}
