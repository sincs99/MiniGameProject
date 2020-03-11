package model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class gameModel {

	// Gameboard Size
	/* TODO: Change implement the function to change gameboard size */

	protected static int rowSize = 6;
	protected static int colSize = 7;

	public static Shape buildBoard() {

		Shape form = new Rectangle((colSize + 1) * view.gameGrid.DISC_SIZE, (rowSize + 1) * view.gameGrid.DISC_SIZE);

		for (int yAxle = 0; yAxle < rowSize; yAxle++) {
			for (int xAxle = 0; xAxle < colSize; xAxle++) {

				Circle c = new Circle(view.gameGrid.DISC_SIZE / 2);
				c.setCenterX(view.gameGrid.DISC_SIZE / 2);
				c.setCenterY(view.gameGrid.DISC_SIZE / 2);
				c.setTranslateX(xAxle * (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE / 4);
				c.setTranslateY(yAxle * (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE / 4);

				form = Shape.subtract(form, c);
			}
		}

		return form;

	}

	public static List<Rectangle> createCol() {
		
		List<Rectangle> colList = new ArrayList<>();
		
		for (int xCol = 0; xCol < colSize; xCol++) {
			
			Rectangle r1 = new Rectangle(view.gameGrid.DISC_SIZE, (rowSize +1)*view.gameGrid.DISC_SIZE);
			r1.setTranslateX(xCol*(view.gameGrid.DISC_SIZE +5)+view.gameGrid.DISC_SIZE / 4);
			
			r1.setFill(Color.TRANSPARENT);
			r1.setOnMouseEntered(e-> r1.setFill(Color.rgb(200, 200, 50, 0.3)));
			r1.setOnMouseExited(e-> r1.setFill(Color.TRANSPARENT));
			
			final int col = xCol;
			
			
			/* TODO: Build Method for setDisc*/
			r1.setOnMouseClicked(null);
			
			colList.add(r1);
			
			
			
		}

		return colList;
	}

}
