package view;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class buttonView {

	private static Button btnDeal, btnShuffle, exit;
	private static HBox buttonPane;

	public static Parent buttonViewBuilder() {

		buttonPane = new HBox(8);

		btnDeal = new Button("Deal");
		btnDeal.setId("button");
		btnShuffle = new Button("Shuffle");
		btnShuffle.setId("button");

		// Exit Button
		exit = new Button("Exit");
		exit.setId("exit");
		exit.setOnAction(e -> Platform.exit());

		buttonPane.getChildren().addAll(btnDeal, btnShuffle, exit);
		buttonPane.setAlignment(Pos.CENTER);

		return buttonPane;
	}
}
