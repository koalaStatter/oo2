package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RadioBut extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("koala 4 life ");
		RadioButton koala=new RadioButton("Koala");
		RadioButton dog=new RadioButton("dog");
		RadioButton cat=new RadioButton("cat");
		koala.setTextFill(Color.BLUE);
		
		ToggleGroup tgAnimals=new ToggleGroup();
		koala.setToggleGroup(tgAnimals);
		dog.setToggleGroup(tgAnimals);
		cat.setToggleGroup(tgAnimals);
		
		VBox vBox=new VBox();
		vBox.setSpacing(5);
		vBox.setPadding(new Insets(20));
		vBox.setAlignment(Pos.CENTER_LEFT);
		vBox.getChildren().addAll(koala, dog,cat);
		
		MyRadioaHandler myRadioaHandler=new MyRadioaHandler();
		koala.setOnAction(myRadioaHandler);
		dog.setOnAction(myRadioaHandler);
		cat.setOnAction(myRadioaHandler);
		
		stage.setScene(new Scene(vBox,300,150));
		stage.show();
	}
	
	private class MyRadioaHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			System.out.println(" you choose "+
		((RadioButton)event.getSource()).getText());
			
		}
	}
	
	public static void main(String[] args) {
			launch(args);
			System.out.println("end");
	}
		
	

}
