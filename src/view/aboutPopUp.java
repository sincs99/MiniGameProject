package view;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class aboutPopUp {
	
	
	//private static Popup about;
	private static Label aboutText, heading;
	private static Button ok;
	private static BorderPane mainPane;
	private static VBox buttonBox;
	private static VBox vText;
	
	public static void createPopUp() {
		
		
		aboutText = new Label("Developer: \nPascal Konezciny\nAndré Kaufmann\nSy-Min La\n\nSupervisor: \nBradley Richards");
		heading = new Label("Java Mini Project #1\n\n");
		heading.setId("h1");
		ok = new Button ("Close");
		
		
		
		buttonBox = new VBox();
		buttonBox.getChildren().addAll(ok);
		buttonBox.setAlignment(Pos.CENTER);
		
		vText = new VBox();
		
		vText.getChildren().addAll(heading, aboutText);
		vText.setAlignment(Pos.CENTER);
		
		mainPane = new BorderPane();
		mainPane.setPadding(new Insets(10, 10, 10, 10));
		
		mainPane.setCenter(vText);
		
		mainPane.setBottom(buttonBox);
		
		Scene popupScene = new Scene(mainPane, 300, 250);
		
		Stage popUp = new Stage();
		
		popUp.setScene(popupScene);
		popUp.setTitle("About Us");
		
		//System.out.println("Test PopUp");
		ok.setOnAction(e-> popUp.close());

		popUp.show();
		
		
	}

}
