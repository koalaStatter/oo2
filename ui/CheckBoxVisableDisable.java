package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxVisableDisable extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox vBox=new VBox();
		
		CheckBox checkBoxShowText=new CheckBox("show text");
		TextField tFieldEnterText=new TextField();
		CheckBox cBoxNoEdit=new CheckBox("stop edit");
		
		tFieldEnterText.setVisible(false);
		cBoxNoEdit.setVisible(false);
		
		checkBoxShowText.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(checkBoxShowText.isSelected()) {
					tFieldEnterText.setVisible(true);
					cBoxNoEdit.setVisible(true);
				}
			}
		});
		
		cBoxNoEdit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				tFieldEnterText.setDisable(cBoxNoEdit.isSelected());
				
			}
		});
		vBox.getChildren().addAll
			(checkBoxShowText,tFieldEnterText,cBoxNoEdit);
		
		stage.setScene(new Scene(vBox,300,500));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
