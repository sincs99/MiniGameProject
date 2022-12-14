package gameminiproject;

import javafx.application.Platform;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Pos;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import model.Disc;

import model.gameModel;
import player.Player;
import view.HomeScreen;
import view.WinPopUp;
import view.buttonView;
import view.gameGrid;
import view.gameView;
import view.topMenuBar;

public class gameController extends gameGrid {

	private gameView view;
	private gameModel model;

	protected Player player1;

	private static SimpleBooleanProperty trigger = new SimpleBooleanProperty();

	private static gameView sView;

	public gameController(gameView view, gameModel model) {
		this.view = view;
		this.model = model;

		// MVC umgehung für Conditional refresh
		gameController.setsView(view);

		view.getMenuBar().getBlue().setOnAction(e -> {
			gameModel.setGameBoard(Color.BLUE);

			this.refreshGameBoard();
		});

		view.getMenuBar().getRed().setOnAction(e -> {
			gameModel.setGameBoard(Color.INDIANRED);

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

		view.getMenuBar().getColor1().setOnAction(e -> {
			Disc.setC1(Color.RED);

			this.refreshGameBoard();
		});

		view.getMenuBar().getColor2().setOnAction(e -> {
			Disc.setC1(Color.CORNFLOWERBLUE);
			this.refreshGameBoard();
		});

		view.getMenuBar().getColor3().setOnAction(e -> {
			Disc.setC2(Color.YELLOW);
			this.refreshGameBoard();
		});

		view.getMenuBar().getColor4().setOnAction(e -> {
			Disc.setC2(Color.GREEN);

			this.refreshGameBoard();
		});

		buttonView.getButtonView().getBtnStartGame().setOnAction(e -> {

			// Only for testing purposes if event handler is working
//			System.out.println("Fired"); 

			HomeScreen.getHomeScreen().setPlayerName();

			player.Player.getPlayerView().getLblplayer1().setText(HomeScreen.getHomeScreen().getPlayer1());

			player.Player.getPlayerView().getLblplayer2().setText(HomeScreen.getHomeScreen().getPlayer2());

			System.out.println(HomeScreen.getHomeScreen().getPlayer1());

			view.getOnRow().setText(HomeScreen.getHomeScreen().getPlayer1());

			view.changeScene();

		});

		buttonView.getButtonView().getBtnNewGame().setOnAction(e -> {

			this.refreshGameBoard();

		});

		view.getMenuBar().getNewGame().setOnAction(e -> {
			this.refreshGameBoard();

		});

		trigger.addListener(c -> {
			this.refreshGameBoard();
		});

	}

	private void refreshGameBoard() {

		view.getRoot().setCenter(null);
		view.getRoot().setCenter(gameGrid.createBoard());
		view.getRoot().setLeft(null);
		view.getRoot().setRight(null);
		view.getRoot().setRight(player.Player.getPlayerView().playerRightViewBuilder());
		view.getRoot().setLeft(player.Player.getPlayerView().playerLeftViewBuilder());

	}

	public static gameView getsView() {
		return sView;
	}

	public static void setsView(gameView sView) {
		gameController.sView = sView;
	}

	public static void triggerRefresh() {
		trigger.setValue(!trigger.getValue());
	}

}
