package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import view.gameGrid;

public class Disc extends Circle {

	protected final boolean red;
	protected static Color c1 = Color.DARKRED;
	protected static Color c2 = Color.YELLOWGREEN;

	public Disc(boolean red) {
		super(view.gameGrid.DISC_SIZE / 2, red ? c1 : c2);
		this.red = red;

		setCenterX(view.gameGrid.DISC_SIZE / 2);
		setCenterY(view.gameGrid.DISC_SIZE / 2);

	}

	public static Color getC1() {
		return c1;
	}

	public static void setC1(Color c1) {
		Disc.c1 = c1;
	}

	public static Color getC2() {
		return c2;
	}

	public static void setC2(Color c2) {
		Disc.c2 = c2;
	}

}
