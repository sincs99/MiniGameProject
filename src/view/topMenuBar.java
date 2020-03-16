package view;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import model.gameModel;

public class topMenuBar extends MenuBar {

	private Menu help, gameProperties, start, gameBoard, color;
	private MenuItem rules, about, exit, newGame, sevenSix, fourFour, blue, red;
	//public static ColorPicker colorOfBoard;


	public topMenuBar() {
		
		

		//colorOfBoard = new ColorPicker();
		//colorOfBoard.setValue(Color.DARKRED);
		
		//form.setFill(colorOfBoard.getValue());
		
		
		
		
		

		help = new Menu("Help");
		gameProperties = new Menu("Properties");
		start = new Menu("File");

		rules = new MenuItem("Rules");
		about = new MenuItem("About");

		about.setOnAction(e -> aboutPopUp.createPopUp());

		color = new Menu("Color");
		blue = new MenuItem("Blue");
		red = new MenuItem("Red");
		//color.setOnAction(e->colorOfBoard);

		exit = new MenuItem("Exit");
		newGame = new MenuItem("New Game");

		// Gameboard is Parent menu of sevenSix and FourFour

		gameBoard = new Menu("GameBoard");
		sevenSix = new MenuItem("7x6");
		fourFour = new MenuItem("4x4");
		
		//color.getItems().addAll(colorOfBoard);
		
		

		color.getItems().addAll(blue, red);
		gameBoard.getItems().addAll(sevenSix, fourFour);
		help.getItems().addAll(rules, about);
		gameProperties.getItems().addAll(color, gameBoard);
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

	public Menu getColor() {
		return color;
	}

	public void setColor(Menu color) {
		this.color = color;
	}

	public MenuItem getBlue() {
		return blue;
	}

	public void setBlue(MenuItem blue) {
		this.blue = blue;
	}

	public MenuItem getRed() {
		return red;
	}

	public void setRed(MenuItem red) {
		this.red = red;
	}

	public void setGameProperties(Menu gameProperties) {
		this.gameProperties = gameProperties;
	}
	
	


}
