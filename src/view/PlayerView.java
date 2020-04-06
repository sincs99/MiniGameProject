package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PlayerView {
	
	
	private static Label name = new Label();
	private static Label playerName = new Label ("Playername: ");
	private static TextField nameInput = new TextField();
	private static HBox playerNameBox = new HBox(playerName, name);
	private static VBox nameBox = new VBox (10, nameInput, playerNameBox);
	
	
	
	public static VBox playerName() {
		
		nameInput.setMaxWidth(200);
		playerNameBox.setAlignment(Pos.CENTER);
		name.textProperty().bind(nameInput.textProperty());
		//playerName.setText(HomeScreen.player1);
		//System.out.println(HomeScreen.player1);
		
		return nameBox;
		
	}
	
	
	
	

}
