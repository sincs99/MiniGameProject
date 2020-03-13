package view;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class menuBar {
	
	
	
	private static MenuBar menuBar;
	private static Menu help, properties, start, gameBoard;
	private static MenuItem rules, about, gameBoardSize, exit, newGame, sevenSix, fourFour;
	
	public static Parent createMenuBar() {
		
		
		menuBar = new MenuBar();
		
		help =  new Menu("Help");
		properties = new Menu("Properties");
		start = new Menu ("File");
		
		
		
		rules = new MenuItem("Rules");
		about = new MenuItem("About");
		
		about.setOnAction(e->aboutPopUp.createPopUp());
		
		gameBoardSize = new MenuItem("Size of GameBoard");
		exit = new MenuItem("Exit");
		newGame = new MenuItem("New Game");
		
		//Gameboard is Parent menu of sevenSix and FourFour
		
		gameBoard = new Menu("GameBoard");
		sevenSix = new MenuItem("7x6");
		fourFour = new MenuItem("4x4");
		
		gameBoard.getItems().addAll(sevenSix, fourFour);
		help.getItems().addAll(rules, about);
		properties.getItems().addAll(gameBoardSize, gameBoard);
		start.getItems().addAll(newGame, exit);
		
		menuBar.getMenus().addAll(start, properties, help);
		
		menuBar.setPadding(new Insets(0, 0, 0, 0));
		
			
		
		
		return menuBar;
		
	}

}
