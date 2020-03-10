package view;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.gameModel;

public class gameView {

	private Stage stage;
	private gameModel model;
	protected Button btnDeal, btnShuffle, exit;
	protected Label lblplayer1, lblplayer2, lblcards1, lblcards2;

	public gameView(Stage stage, gameModel model) {
		this.stage = stage;
		this.model = model;

		this.btnDeal = btnDeal;
		this.btnShuffle = btnShuffle;
		this.lblplayer1 = lblplayer1;
		this.lblplayer2 = lblplayer2;
		this.lblcards1 = lblcards1;
		this.lblcards2 = lblcards2;
		
		
		//Boxing

		BorderPane root = new BorderPane();
		VBox player1 = new VBox();
		VBox player2 = new VBox();
		HBox card1 = new HBox();
		HBox card2 = new HBox();
		HBox info = new HBox(8);
		info.setAlignment(Pos.CENTER);
		
		//Buttons
		
		this.btnDeal = new Button("Deal");
		this.btnDeal.setId("button");
		this.btnShuffle = new Button("Shuffle");
		this.btnShuffle.setId("button");
		
		
		//Exit Button
		this.exit = new Button("Exit");
		this.exit.setId("exit");
		this.exit.setOnAction(e->Platform.exit());
		
		//Labels
		
		this.lblplayer1 = new Label("Player 1");
		this.lblplayer1.setId("playerText");
		this.lblplayer2 = new Label("Player 2");
		this.lblplayer2.setId("playerText");
		
		//Building the Boxes

		player1.getChildren().addAll(lblplayer1, card1);
		player2.getChildren().addAll(lblplayer2, card2);
		info.getChildren().addAll(btnDeal, btnShuffle, exit);
		
		//Setting root Objects

		root.setLeft(player1);
		root.setRight(player2);
		root.setBottom(info);
		
		root.setPadding(new Insets(10, 10, 10, 10));
		
		//Setting Scene

		Scene scene = new Scene(root, 800, 500);
		scene.getStylesheets().add(getClass().getResource("Poker.css").toExternalForm());
		stage.setScene(scene);
		stage.setTitle("Poker Mini Game");

	}

	public void start() {
		stage.show();

	}

}
