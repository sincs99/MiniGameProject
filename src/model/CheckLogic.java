package model;

import java.util.ArrayList;
import java.util.List;

import gameminiproject.gameController;
import javafx.geometry.Point2D;

public class CheckLogic {
	



	List<Point2D> points = new ArrayList <Point2D>(); 
	
	
	protected static boolean checkMove(List<Point2D> points) {
		
		
		gameController.getsView().getOnRow().setText(gameModel.isRedMove() ? "Player 2 Is on the Row" : "Player 1 Is on the Row");
		
		
		int chain = 0;
		
		
		
		for(Point2D p : points) {
			int col = (int) p.getX();
			int row = (int) p.getY();
			
			Disc disc = gameModel.getDisc (col, row).orElse(new Disc(!gameModel.redMove));
			
		
			
			if (disc.red == gameModel.redMove) {
				chain++;
				if (chain == 4) {
					return true;
				}
			}else {
				chain = 0;
			}
		}
		
		return false;
		
	}
	
	

}
