package gameminiproject;

import javafx.application.Application;
import javafx.stage.Stage;
import model.gameModel;
import view.gameView;

public class main extends Application {

	private gameView view;
	private gameController controller;
	private gameModel model;

	public static void main(String[] args) {
		launch();

	}

	public void start(Stage stage) throws Exception {
		this.model = new gameModel();
		this.view = new gameView(stage, model);
		this.controller = new gameController(view, model);

		view.start();

	}

}
