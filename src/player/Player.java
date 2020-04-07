package player;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.Disc;
import model.gameModel;
import view.HomeScreen;
import view.buttonView;
import view.gameView;

public class Player {

	private HBox hL, hR;
	private VBox mL, mR;
	private Circle c1, c2;
	private static Player pV;
	private static Color ciL, ciR;
	protected Label lblplayer1, lblplayer2, color;
	private final Label CUR_COLOR1 = new Label("Current Chip Color");
	private final Label CUR_COLOR2 = new Label("Current Chip Color");

	public static Player getPlayerView() {
		if (pV == null) {
			pV = new Player();
		}

		return pV;
	}

	private Player() {

	}

	public Parent playerLeftViewBuilder() {

		// a spacer to seperate the visible elements a little
		Region spacerHeight, spacerWidth;
		spacerHeight = new Region();
		spacerWidth = new Region();
		spacerHeight.setPrefHeight(gameView.SPACER_HEIGHT);
		spacerWidth.setPrefWidth(gameView.SPACER_HEIGHT);

		hL = new HBox();

		mL = new VBox(10);
		mL.setPadding(new Insets(10, 10, 10, 10));
		mL.setPrefWidth(200);
		mL.setAlignment(Pos.TOP_LEFT);

		ciL = Disc.getC1();

		lblplayer1 = new Label(HomeScreen.getHomeScreen().getPlayer1());

		lblplayer1.setId("playerText");

		c1 = new Circle();

		c1.setRadius(50f);
		c1.setFill(ciL);

		mL.getChildren().addAll(lblplayer1, spacerHeight, CUR_COLOR1, c1);
		hL.getChildren().addAll(spacerWidth, mL);

		return hL;
	}

	public Parent playerRightViewBuilder() {

		// a spacer to seperate the visible elements a little
		Region spacerHeight, spacerWidth;
		spacerHeight = new Region();
		spacerWidth = new Region();
		spacerHeight.setPrefHeight(gameView.SPACER_HEIGHT);
		spacerWidth.setPrefWidth(gameView.SPACER_HEIGHT);

		hR = new HBox();

		mR = new VBox(10);
		mR.setPadding(new Insets(10, 10, 10, 10));
		mR.setPrefWidth(200);
		mR.setAlignment(Pos.TOP_RIGHT);

		ciR = Disc.getC2();

		lblplayer2 = new Label(HomeScreen.getHomeScreen().getPlayer2());

		lblplayer2.setId("playerText");

		c2 = new Circle();

		c2.setRadius(50f);
		c2.setFill(ciR);

		mR.getChildren().addAll(lblplayer2, spacerHeight, CUR_COLOR2, c2);

		hR.getChildren().addAll(mR, spacerWidth);

		return hR;
	}

	public VBox getmL() {
		return mL;
	}

	public void setmL(VBox mL) {
		this.mL = mL;
	}

	public VBox getmR() {
		return mR;
	}

	public void setmR(VBox mR) {
		this.mR = mR;
	}

	public Circle getC2() {
		return c2;
	}

	public void setC2(Circle c2) {
		this.c2 = c2;
	}

	public static Player getpV() {
		return pV;
	}

	public static void setpV(Player pV) {
		Player.pV = pV;
	}

	public static Color getCiL() {
		return ciL;
	}

	public static void setCiL(Color ciL) {
		Player.ciL = ciL;
	}

	public static Color getCiR() {
		return ciR;
	}

	public static void setCiR(Color ciR) {
		Player.ciR = ciR;
	}

	public Label getLblplayer1() {
		return lblplayer1;
	}

	public void setLblplayer1(Label lblplayer1) {
		this.lblplayer1 = lblplayer1;
	}

	public Label getLblplayer2() {
		return lblplayer2;
	}

	public void setLblplayer2(Label lblplayer2) {
		this.lblplayer2 = lblplayer2;
	}

}
