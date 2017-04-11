package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	private int counter = 0;
	
	@Override
	public void start(Stage primaryStage) {
		
		VBox window = new VBox();
		Label header = new Label("Welcome to this AFK game!");
		Scene sc = new Scene(window, 300, 300);
		Label score = new Label("Score: " + counter);
		// int counter = 0;
		Button pressMe = new Button("Press Me!");
		pressMe.setOnMouseClicked(e ->{
			score.setText("Score: " + ++counter);
			}
		);
		sc.getStylesheets().add("application/application.css");
		header.getStyleClass().add("header");
		window.setAlignment(Pos.TOP_CENTER); 
		window.getChildren().add(header);
		window.getChildren().add(pressMe);
		window.getChildren().add(score);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
