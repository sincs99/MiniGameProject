package view;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class buttonView {

	private static Button btnNewGame, btnShuffle, exit;
	private static HBox buttonPane;

	public static Parent buttonViewBuilder() {

		buttonPane = new HBox(8);

		btnNewGame = new Button("New Game");
		btnNewGame.setId("button");
		btnShuffle = new Button("Shuffle");
		btnShuffle.setId("button");

		// Exit Button
		exit = new Button("Exit");
		exit.setId("exit");
		exit.setOnAction(e -> Platform.exit());

		buttonPane.getChildren().addAll(btnNewGame, btnShuffle, exit);
		buttonPane.setAlignment(Pos.CENTER);

		return buttonPane;
	}
}
