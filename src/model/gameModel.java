package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class gameModel {
	// Gameboard Size

	// GameboardSize is changeable in gameController with MenuItems

	protected static int rowSize = 6;
	protected static int colSize = 7;

	protected static Color GAME_BOARD = Color.BLUEVIOLET;
	
	private static boolean redMove = true;
	private static Disc[][] grid = new Disc [rowSize][colSize];
	
	

	// Color for Row Hover effect
	protected final static Color HOVER_FILL = new Color(0.5, 1.0, 1.0, 0.3);

	public static Shape buildBoard() {

		Shape form = new Rectangle((colSize + 1) * view.gameGrid.DISC_SIZE, (rowSize + 1) * view.gameGrid.DISC_SIZE);

		for (int yAxle = 0; yAxle < rowSize; yAxle++) {
			for (int xAxle = 0; xAxle < colSize; xAxle++) {

				Circle c = new Circle(view.gameGrid.DISC_SIZE / 2);

				c.setCenterX(view.gameGrid.DISC_SIZE / 2);
				c.setCenterY(view.gameGrid.DISC_SIZE / 2);
				
				// +5 space between disc's
				c.setTranslateX(xAxle * (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE / 3);
				c.setTranslateY(yAxle * (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE / 3);

				form = Shape.subtract(form, c);

				form.setFill(GAME_BOARD);

			}
		}

		return form;

	}

	public static List<Rectangle> createCol() {

		List<Rectangle> colList = new ArrayList<>();

		for (int xCol = 0; xCol < colSize; xCol++) {

			Rectangle r1 = new Rectangle(view.gameGrid.DISC_SIZE, (rowSize + 1) * view.gameGrid.DISC_SIZE);
			r1.setTranslateX(xCol * (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE / 4);

			r1.setFill(Color.TRANSPARENT);
			r1.setOnMouseEntered(e -> r1.setFill(HOVER_FILL));

			r1.setOnMouseExited(e -> r1.setFill(Color.TRANSPARENT));

			final int col = xCol;

			/* TODO: Build Method for setDisc */
			r1.setOnMouseClicked(e -> {
				/* TODO: Place Disk method */

				//placeDisc(new Disc(redMove), col);
				System.out.println("Test Mouse Click");
			});

			colList.add(r1);

		}

		return colList;
	}

//	private static void placeDisc(Disc disc, int col) {
//		int row = rowSize -1;
//		
//		
//		do {
//			if (!getDisc(col, row).isPresent())
//				break;
//			
//			row--;
//			
//		} while (row >=0);
//		if (row < 0)
//			return;
//		
//		grid[col][row] = disc;
//		
//		//TODO: Experimental Test
//		view.gameGrid.createBoard();
//		
//		//End Test
//		disc.setTranslateX(col * (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE / 4);
//		final int rowAtm = row;
//		
//		TranslateTransition animation = new TranslateTransition(Duration.seconds(0.5), disc);
//		animation.setToY(row* (view.gameGrid.DISC_SIZE + 5) + view.gameGrid.DISC_SIZE /4);
//		animation.setOnFinished(e->{
//			
//			//TODO:FIX some errors!!!!
//			if (gameEnded(col, rowAtm)) {
//				gameOver();
//			}
//			
//			redMove = !redMove;
//		});
//		
//		animation.play();
//		
//	}
	
	
	private static Optional <Disc> getDisc(int col, int row){
		if (col < 0 || col >= colSize || row < 0 || row>=rowSize)
			return Optional.empty();
		
		return Optional.ofNullable(grid[col][row]);
		
	}

//	private static Object getDisc(int col, int row) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static int getRowSize() {
		return rowSize;
	}

	public static void setRowSize(int rowSize) {
		gameModel.rowSize = rowSize;
	}

	public static int getColSize() {
		return colSize;
	}

	public static void setColSize(int colSize) {
		gameModel.colSize = colSize;
	}

	public static Color getGameBoard() {
		return GAME_BOARD;
	}

	public static void setGameBoard(Color GAME_BOARD) {
		gameModel.GAME_BOARD = GAME_BOARD;
	}

}
