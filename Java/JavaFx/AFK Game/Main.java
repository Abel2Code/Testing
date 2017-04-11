package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*primaryStage.setTitle("AFK Game");
		final Text HEADER = new Text("Welcome to this AFK game!");
		StackPane root = new StackPane();
		root.getChildren().add(HEADER);
		Scene sc = new Scene(root, 400, 400);
		primaryStage.setScene(sc);
		primaryStage.show();	

		BorderPane root = new BorderPane();			
		primaryStage.setTitle("AFK Game");
		final Text TITLE = new Text("Welcome to this AFK game!");
		root.getChildren().add(TITLE);
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();*/
		
		VBox window = new VBox();
		Label header = new Label("Welcome to this AFK game!");
		Scene sc = new Scene(window, 300, 300);
		sc.getStylesheets().add("application/application.css");
		header.getStyleClass().add("header");
		window.setAlignment(Pos.TOP_CENTER); 
		window.getChildren().add(header);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
