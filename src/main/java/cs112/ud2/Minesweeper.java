package cs112.ud2;

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.geometry.Pos;             //used to reposition text and other components within the window of the vbox
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

import javafx.scene.text.Font;          //Assists with text resizing
public class Minesweeper extends Application implements EventHandler<ActionEvent>{

    public static void main(String[] args){
        launch(args);
    }
    public Button startButton;
    public Label startLabel;
    @Override
    public void start(Stage primaryStage){
        startLabel = new Label("Welcome to Minesweeper!");

        startButton = new Button("Play!");
        startButton.setOnAction(this);

        //ADDING COMPONENTS
        VBox layout = new VBox(25); //15 = the spacing between components
        layout.getChildren().add(startLabel);
        layout.getChildren().add(startButton);
        layout.setAlignment(Pos.CENTER);
        startLabel.setFont(new Font("Arial",24)); //RESIZES THE LABEL AND CHANGES FONT
        startButton.setFont(new Font("Arial", 24)); //RESIZES THE BUTTON AND CHANGES FONT
        
        //DISPLAYING COMPONENTS
        Scene scene = new Scene(layout, 400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Minesweeper");
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent){
        if (actionEvent.getSource()==startButton){
            System.out.println("Start button was clicked!");
            //PLACEHOLDER UNTIL WE CAN ADD OTHER WINDOWS OR CHANGE THE LAYOUT TO INDICATE STARTING THE GAME
        }
    }
}
