package ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneExample extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		StackPane stackPane=new StackPane();
		stackPane.setPadding(new Insets(10));
		stackPane.setAlignment(Pos.CENTER);
		for(int i=0;i<9;i++) {
			Label lab=new Label("show "+i);
			stackPane.getChildren().add(lab);
		}
		stage.setScene(new Scene(stackPane,100,100));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
