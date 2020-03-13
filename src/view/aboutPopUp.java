package view;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;

public class aboutPopUp {
	
	
	private static Popup about;
	private static Label aboutText;
	private static Button ok;
	private static VBox mainFrame;
	
	
	public static Parent createPopUp() {
		
		about = new Popup();
		aboutText = new Label("Test text");
		ok = new Button ("All good :)");
		
		/*TODO:
		 * 
		 * Find an solution to close the Popup
		 * //ok.setOnAction(e-> Popup.close());
		 * */
		
		
		mainFrame = new VBox(8);
		
		mainFrame.getChildren().addAll(aboutText, ok);
		
		System.out.println("Test PopUp");
		
		/*TODO:
		 * 
		 * How do i show it in Stage?
		 * 
		 * about.show();
		 * 
		 * 
		 * */
		
		
		return mainFrame;
		
	}

}
