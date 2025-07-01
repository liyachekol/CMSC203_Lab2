import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {

    @Override
    public void start(Stage stage) {
        // Create an instance of FXMainPane (your main GUI layout)
        FXMainPane root = new FXMainPane();

        // Set the scene with root node and size
        Scene scene = new Scene(root, 600, 150);

        // Set stage properties
        stage.setTitle("GUI Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
