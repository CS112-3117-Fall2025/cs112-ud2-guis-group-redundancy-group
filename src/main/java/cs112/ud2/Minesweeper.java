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
    //SETTING UP VARIABLES
    private Button startButton;
    private Label startLabel;

    //Overrides the inherited class from Application, uses it to set up and execute the window/program
    @Override
    public void start(Stage primaryStage){
        //ASSIGNING VALUES TO THE VARIABLES/MAKING THEM COMPONENTS
        startLabel = new Label("Welcome to Minesweeper!"); //makes it a label
        startButton = new Button("Play!"); //makes it a button
        startButton.setOnAction(this); //allows the button to print to the console when clicked

        //ADDING COMPONENTS
        VBox layout = new VBox(25); //15 = the spacing between components
        layout.getChildren().add(startLabel); //gets the label for the layout
        layout.getChildren().add(startButton); //gets the button for the layout
        layout.setAlignment(Pos.CENTER); //positions the layout of the label and button to the center of the window
        startLabel.setFont(new Font("Arial",24)); //RESIZES THE LABEL AND CHANGES FONT
        startButton.setFont(new Font("Arial", 24)); //RESIZES THE BUTTON AND CHANGES FONT
        
        //DISPLAYING COMPONENTS
        Scene scene = new Scene(layout, 400,400); //assigns data to the variable
        primaryStage.setScene(scene); //sets up the window in accordance to the variable given
        primaryStage.setTitle("Minesweeper"); //titles the window/program
        primaryStage.show(); //shows the window
    }

    //overrides the handler from the parent class, allows the button to respond by printing a message to the console
    @Override
    public void handle(ActionEvent actionEvent){
        if (actionEvent.getSource() == startButton){ //checks that the source is the start button
            System.out.println("Start button was clicked!");
            //PLACEHOLDER UNTIL WE CAN ADD OTHER WINDOWS OR CHANGE THE LAYOUT TO INDICATE STARTING THE GAME
        }
    }
}
