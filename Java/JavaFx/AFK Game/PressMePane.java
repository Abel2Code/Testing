package application;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.GridPane;

public class PressMePane extends GridPane{
	Button[][] buttons;
	int rows = 18;
	int cols = 22;

	public void start(){
		buttons = new Button[rows][cols];
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				Button b = new Button(" ");
				b.setMinWidth(70);
				buttonSetup(b, r, c);
				buttons[r][c] = b;
				add(b, r, c);
			}
			
		}
	}
	
	public void buttonSetup(Button b, int row, int col){
		
		b.setOnMouseClicked(new EventHandler<InputEvent>(){
			int counter = 0;
			@Override
			public void handle(InputEvent arg0){
				Main.changeScore++;
				b.setText("" + ++counter);
				Main.scoreValue.setText(String.valueOf(Main.changeScore));
			}
		});
	}
}
