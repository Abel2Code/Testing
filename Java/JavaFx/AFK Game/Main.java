package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	private int changeScore;
	
	@Override
	public void start(Stage primaryStage) {
		
		VBox window = new VBox();
		Label header = new Label("Welcome to this AFK game!");
		Scene sc = new Scene(window, 300, 300);
		Label score = new Label("Score: ");
		Label scoreValue = new Label("0");
		// int counter = 0;
		Button pressMe = new Button("Press Me!");
		pressMe.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
			@Override
			public void handle(Event event){
				changeScore++;
				scoreValue.setText(String.valueOf(changeScore));
			}
		});
		sc.getStylesheets().add("application/application.css");
		header.getStyleClass().add("header");
		window.setAlignment(Pos.TOP_CENTER); 
		window.getChildren().add(header);
		window.getChildren().add(pressMe);
		window.getChildren().add(score);
		window.getChildren().add(scoreValue);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
