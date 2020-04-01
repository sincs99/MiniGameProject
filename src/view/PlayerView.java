package view;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class PlayerView {

	private VBox playerBox;
	private Label playerName;
	private VBox player;

	public PlayerView(VBox playerBox, Label playerName) {
		this.playerBox = playerBox;
		this.playerName = playerName;

		//createPlayerView();

	}



	

	public VBox getPlayerBox() {
		return playerBox;
	}

	public void setPlayerBox(VBox playerBox) {
		this.playerBox = playerBox;
	}

	public Label getPlayerName() {
		return playerName;
	}

	public void setPlayerName(Label playerName) {
		this.playerName = playerName;
	}

}
