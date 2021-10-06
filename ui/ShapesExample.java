package ui;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapesExample extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		VBox vBox=new VBox();
		vBox.setSpacing(40);
		vBox.setAlignment(Pos.CENTER);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setWidth(20);
		rectangle.setHeight(42);
		rectangle.setFill(Color.BLUE);
		rectangle.setStroke(Color.RED);
		
		Line line=new Line();
		line.setStrokeWidth(42);
		line.setStroke(Color.BLUEVIOLET);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(42);
		line.setEndY(100);
		
		line.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("in shape");
				line.setFill(Color.AQUA);
				
			}
		});
		line.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("out side");
				
			}
		});
		
		Ellipse eli=new Ellipse();
		eli.setCenterX(9);
		eli.setCenterY(25);
		eli.setRadiusX(42);
		eli.setRadiusY(12);
		eli.setFill(Color.GREENYELLOW);
		eli.setStroke(Color.AQUAMARINE);
		
		vBox.getChildren().addAll(rectangle,line,eli);
		
		stage.setScene(new Scene(vBox,300,500));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
		
	

}
