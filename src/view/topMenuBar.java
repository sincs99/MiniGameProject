package view;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import model.gameModel;

public class topMenuBar extends MenuBar {
	
	
	
	
	private  Menu help, gameProperties, start, gameBoard;
	private  MenuItem rules, about, gameBoardSize, exit, newGame, sevenSix, fourFour;
	
	
	public topMenuBar() {
		
		

		
		help =  new Menu("Help");
		gameProperties = new Menu("Properties");
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
		gameProperties.getItems().addAll(gameBoardSize, gameBoard);
		start.getItems().addAll(newGame, exit);
		
		this.getMenus().addAll(start, gameProperties, help);
		
		this.setPadding(new Insets(0, 0, 0, 0));
		
		
		

		
	}


	public Menu getHelp() {
		return help;
	}


	public void setHelp(Menu help) {
		this.help = help;
	}


	public Menu getGameProperties() {
		return gameProperties;
	}


	public void setProperties(Menu gameProperties) {
		this.gameProperties = gameProperties;
	}


	public Menu getStart() {
		return start;
	}


	public void setStart(Menu start) {
		this.start = start;
	}


	public Menu getGameBoard() {
		return gameBoard;
	}


	public void setGameBoard(Menu gameBoard) {
		this.gameBoard = gameBoard;
	}


	public MenuItem getRules() {
		return rules;
	}


	public void setRules(MenuItem rules) {
		this.rules = rules;
	}


	public MenuItem getAbout() {
		return about;
	}


	public void setAbout(MenuItem about) {
		this.about = about;
	}


	public MenuItem getGameBoardSize() {
		return gameBoardSize;
	}


	public void setGameBoardSize(MenuItem gameBoardSize) {
		this.gameBoardSize = gameBoardSize;
	}


	public MenuItem getExit() {
		return exit;
	}


	public void setExit(MenuItem exit) {
		this.exit = exit;
	}


	public MenuItem getNewGame() {
		return newGame;
	}


	public void setNewGame(MenuItem newGame) {
		this.newGame = newGame;
	}


	public MenuItem getSevenSix() {
		return sevenSix;
	}


	public void setSevenSix(MenuItem sevenSix) {
		this.sevenSix = sevenSix;
	}


	public MenuItem getFourFour() {
		return fourFour;
	}


	public void setFourFour(MenuItem fourFour) {
		this.fourFour = fourFour;
	}

}
