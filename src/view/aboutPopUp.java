package view;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class aboutPopUp {
	
	
	//private static Popup about;
	private static Label aboutText;
	private static Button ok;
	private static BorderPane mainPane;
	private static VBox buttonBox;
	
	
	public static void createPopUp() {
		
		//about = new Popup();
		aboutText = new Label("Test text");
		ok = new Button ("All good :)");
		
		/*TODO:
		 * 
		 * Find an solution to close the Popup
		 * 
		 * 
		 * 
		 * 
		 * ok.setOnAction(e-> Popup.close());
		 * */
		
		//ok.setOnAction(e-> );
		
		buttonBox = new VBox();
		buttonBox.getChildren().addAll(ok);
		buttonBox.setAlignment(Pos.CENTER);
		
		mainPane = new BorderPane();
		mainPane.setPadding(new Insets(10, 10, 10, 10));
		
		mainPane.setCenter(aboutText);
		
		mainPane.setBottom(buttonBox);
		
		Scene popupScene = new Scene(mainPane, 250, 150);
		
		Stage popUp = new Stage();
		
		popUp.setScene(popupScene);
		popUp.setTitle("About Us");
		
		System.out.println("Test PopUp");
		

		popUp.show();
		
		
	}

}
