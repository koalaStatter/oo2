package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UIWithButton extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("koala 4 life ");
		
		Button btn=new Button();
		btn.setText("hit me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("I know what you did last summer");
				
			}
		});
		
		StackPane pane=new StackPane();
		pane.getChildren().add(btn);
		pane.setBackground(new Background(new BackgroundFill(
				Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
		stage.setScene(new Scene(pane,1000,500));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
		System.out.println("end");
	}
	

}
