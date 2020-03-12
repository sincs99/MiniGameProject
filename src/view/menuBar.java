package view;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class menuBar {
	
	
	
	private static MenuBar menuBar;
	private static Menu help, properties, start;
	private static MenuItem rules, about, gameBoardSize, exit, newGame;
	
	public static Parent createMenuBar() {
		
		
		menuBar = new MenuBar();
		
		help =  new Menu("Help");
		properties = new Menu("Properties");
		start = new Menu ("File");
		
		rules = new MenuItem("Rules");
		about = new MenuItem("About");
		gameBoardSize = new MenuItem("Size of GameBoard");
		exit = new MenuItem("Exit");
		newGame = new MenuItem("New Game");
		
		
		help.getItems().addAll(rules, about);
		properties.getItems().addAll(gameBoardSize);
		start.getItems().addAll(newGame, exit);
		
		menuBar.getMenus().addAll(start, properties, help);
		
		menuBar.setPadding(new Insets(0, 0, 0, 0));
		
			
		
		
		return menuBar;
		
	}

}
