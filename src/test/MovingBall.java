package test;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

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

class BallPane extends Pane {

    public final double radius = 30;
    private double x = 2 * radius, y = 3 * radius;
    private double dx = 3; // Number of pixels to move each time
    private Circle circle = new Circle(x, y, radius);
    private Timeline animation;

    public BallPane() {
        circle.setFill(Color.BLACK); // Set ball color
        getChildren().add(circle); // Place a ball into this pane
        // Create the animation for 25 millisecond events
        animation = new Timeline(new KeyFrame(Duration.millis(25), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }
    // Move the ball. When a wall is encountered, reverse direction
    protected void moveBall() {
        if (x <= radius || x >= getWidth() - radius) {
            dx *= -1; // Change direction
        }
        // Adjust ball position
        x += dx;
        circle.setCenterX(x);
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 10);
    }

    public void decreaseSpeed() {
        animation.setRate(animation.getRate() > 0 ? animation.getRate() - 1 : 0);
    }
}
