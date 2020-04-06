package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HomeScreen extends VBox {

	private VBox v1 = new VBox(20);
	private HBox h1 = new HBox(20);
	private HBox h2 = new HBox(20);
	private Label l1 = new Label("Please type Players Name");
	private Label heading1 = new Label("four connect");
	private Label p1 = new Label("Playername 1: ");
	private Label p2 = new Label("Playername 2: ");
	private TextField t1 = new TextField("Player 1");
	private TextField t2 = new TextField("Player 2");
	private String player1, player2;
	private static HomeScreen hs;

	public static HomeScreen getHomeScreen() {
		if (hs == null) {
			hs = new HomeScreen();
		}

		return hs;
	}

	private HomeScreen() {

	}

	public VBox buildHomeScreen() {

		h1.getChildren().addAll(t1);
		h1.setAlignment(Pos.CENTER);
		h2.getChildren().addAll(t2);
		h2.setAlignment(Pos.CENTER);
		t1.setId("textfield");
		t2.setId("textfield");
		heading1.setId("h1_home");
		l1.setId("subTitle");
		p1.setId("h2");
		p2.setId("h2");

		v1.getChildren().addAll(heading1, l1, h1, h2);
		v1.setAlignment(Pos.CENTER);

		return v1;

	}

	public void setPlayerName() {
		player1 = String.valueOf(t1.getText());
		player2 = String.valueOf(t2.getText());

		System.out.println(player1);
	}

	public TextField getT1() {
		return t1;
	}

	public void setT1(TextField t1) {
		t1 = t1;
	}

	public TextField getT2() {
		return t2;
	}

	public void setT2(TextField t2) {
		t2 = t2;
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		player2 = player2;
	}

}
