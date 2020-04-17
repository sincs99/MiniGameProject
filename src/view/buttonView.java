package view;

import gameminiproject.gameController;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class buttonView extends HBox {

	private Button btnStartGame, exit, btnNewGame;
	private HBox btnBottomPane, btnGamePane;
	private static buttonView btnV;

	public static buttonView getButtonView() {
		if (btnV == null) {
			btnV = new buttonView();
		}

		return btnV;
	}

	private buttonView() {

	}

	public Parent buttonGameViewBuilder() {

		btnGamePane = new HBox(8);

		btnNewGame = new Button("New Game");
		btnNewGame.setId("button");

		exit = new Button("Exit");
		exit.setId("exit");
		exit.setOnAction(e -> {
			Platform.exit();
		});

		btnGamePane.getChildren().addAll(btnNewGame, exit);
		btnGamePane.setAlignment(Pos.CENTER);

		return btnGamePane;
	}

	public Parent buttonStartViewBuilder() {

		btnBottomPane = new HBox(8);

		btnStartGame = new Button("Start Game");
		btnStartGame.setId("button");

		// Exit Button
		exit = new Button("Exit");
		exit.setId("exit");
		exit.setOnAction(e -> {
			Platform.exit();
		});

		btnBottomPane.getChildren().addAll(btnStartGame, exit);
		btnBottomPane.setAlignment(Pos.CENTER);

		return btnBottomPane;
	}

	public Button getBtnStartGame() {
		return btnStartGame;
	}

	public Button getExit() {
		return exit;
	}

	public HBox getButtonPane() {
		return btnBottomPane;
	}

	public void setButtonPane(HBox buttonPane) {
		buttonPane = buttonPane;
	}

	public Button getBtnNewGame() {

		return btnNewGame;
	}
}
