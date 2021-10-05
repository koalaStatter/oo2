
package ui;




import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UI1 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("koala 4 life ");
		StackPane pane=new StackPane();
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
