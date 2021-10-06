package ui;

import java.awt.Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GridExample extends Application {

	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane gPane=new GridPane();
		gPane.setPadding(new Insets(10));
		gPane.setAlignment(Pos.CENTER_LEFT);
		gPane.setGridLinesVisible(true);
		gPane.setHgap(10); //space between column
		gPane.setVgap(10);// space between rows 
		for (int i=0;i<5;i++) {
			Button button=new Button("koala"+i);
			gPane.add(button, i	, i);
		}
		
		stage.setScene(new Scene(gPane,500,340));
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
		

	}


}
