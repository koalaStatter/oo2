package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox vBox=new VBox();
		Label lblText=new Label();
		ComboBox<String> animalsCombo=new ComboBox<String>();
		animalsCombo.getItems().addAll("Koala","Pig","Dog","Cat");
		animalsCombo.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				lblText.setText(
						"Best animal in the World "+animalsCombo.getValue());
				
			}
		});
		
		ComboBox<Color> cbColor=new ComboBox<Color>();
		cbColor.getItems().addAll(Color.PINK,Color.BLUE,Color.RED);
		cbColor.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				lblText.setTextFill(cbColor.getValue());
				
			}
		});
		vBox.getChildren().addAll(animalsCombo,lblText,cbColor);
		stage.setScene(new Scene(vBox,300,300));
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
