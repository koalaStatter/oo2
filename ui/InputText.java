package ui;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InputText extends Application {
	public void start(Stage stage) throws Exception {
		stage.setTitle("koala 4 life ");
		
		Label labelGetName=new Label();
		labelGetName.setText("who are you");
		TextField tfName=new TextField(); //I will read the data
		
		Button btn=new Button();
		btn.setText("say hellow");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				JOptionPane.showMessageDialog(null	, "hi "+tfName.getText());
				
			}
		});	
		HBox hbName=new HBox();
		hbName.getChildren().addAll(labelGetName,tfName,btn);
		
		stage.setScene(new Scene(hbName,1000,500));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
		System.out.println("end");
	}
	
	

}
