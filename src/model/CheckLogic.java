package model;

import java.util.ArrayList;
import java.util.List;

import gameminiproject.gameController;
import javafx.geometry.Point2D;
import view.HomeScreen;

public class CheckLogic {
	



	List<Point2D> points = new ArrayList <Point2D>(); 
	
	
	protected static boolean checkMove(List<Point2D> points) {
		
		
		gameController.getsView().getOnRow().
		setText(gameModel.isRedMove() ? HomeScreen.getHomeScreen().getPlayer2() + " is on the Row" : HomeScreen.getHomeScreen().getPlayer1()+" is on the Row");
		gameController.getsView().getStartText().setText(null);
		

		
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
