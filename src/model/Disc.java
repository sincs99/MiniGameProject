package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import view.gameGrid;

public class Disc extends Circle {

	private final boolean red;

	public Disc(boolean red) {
		super(view.gameGrid.DISC_SIZE / 2, red ? Color.DARKRED : Color.GREENYELLOW);
		this.red = red;

		setCenterX(view.gameGrid.DISC_SIZE / 2);
		setCenterY(view.gameGrid.DISC_SIZE / 2);

	}

}
