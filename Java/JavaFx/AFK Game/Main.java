package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	public static int changeScore;
	public static String thisIsScore;
	public static Label scoreValue = new Label("0");
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane window = new BorderPane();
		Label header = new Label("Welcome to this AFK game!");
		header.setTextFill(Color.RED);
		HBox head = new HBox();
		head.getChildren().add(header);
		Scene sc = new Scene(window, 1400, 600);
		Label score = new Label("Score: ");
		HBox game = new HBox();
		HBox bottom = new HBox();
		window.setTop(head);
		window.setBottom(bottom);
		bottom.getChildren().addAll(score, scoreValue);
		// int counter = 0;
		/*Button pressMe = new Button("Press Me!");
		pressMe.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
			@Override
			public void handle(Event event){
				changeScore++;
				scoreValue.setText(String.valueOf(changeScore));
			}
		});*/
		PressMePane grid = new PressMePane();
		game.getChildren().add(grid);
		window.setCenter(game);
		sc.getStylesheets().add("application/application.css");
		head.getStyleClass().add("center");
		bottom.getStyleClass().add("center");
		score.setTextFill(Color.RED);
		scoreValue.setTextFill(Color.RED);
		grid.start();
		window.getStylesheets().add("application/application.css");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
