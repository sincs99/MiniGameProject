package view;

import gameminiproject.gameController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WinPopUp {
	
	private static Button newGame;

	public static void createPopUp(String title, String message) {

		Stage winPopUp = new Stage();

		winPopUp.initModality(Modality.APPLICATION_MODAL);
		winPopUp.setTitle(title);
		winPopUp.setMinWidth(250);

		Label player = new Label(message);

		
		newGame = new Button("New Game");
		
		newGame.setOnAction(e->{
			gameController.triggerRefresh();
			
			winPopUp.close();
		}); //TODO: change to start new game

		VBox buttonBox = new VBox();
		buttonBox.getChildren().addAll(newGame);
		buttonBox.setAlignment(Pos.CENTER);

		VBox vText = new VBox();

		vText.getChildren().addAll(player, newGame);
		vText.setAlignment(Pos.CENTER);

		vText.setAlignment(Pos.CENTER);
		
		BorderPane mainPane = new BorderPane();
		
		mainPane.setPadding(new Insets(10, 10, 10, 10));
		
		mainPane.setCenter(vText);
		VBox btnBox = new VBox();
		btnBox.getChildren().add(newGame);
		btnBox.setAlignment(Pos.CENTER);
		mainPane.setBottom(btnBox);
		

		Scene popupScene = new Scene(mainPane, 300, 250);
		
		popupScene.getStylesheets().add(WinPopUp.class.getClass().getResource("/resources/Stylesheet.css").toExternalForm());

		winPopUp.setScene(popupScene);

		winPopUp.show();

	}
	


	public static Button getNewGame() {
		return newGame;
	}

	public static void setNewGame(Button newGame) {
		WinPopUp.newGame = newGame;
	}
	
	

}
