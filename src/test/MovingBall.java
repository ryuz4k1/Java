package test;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MovingBall extends Application {

    @Override
    public void start(Stage primaryStage) {

        BallPane ballPane = new BallPane(); // Create a ball pane
        // Pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());
        // Create a scene and place it in the stage
        Scene scene = new Scene(ballPane, 250, 150);
        primaryStage.setTitle("Bouncing Ball Control"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
