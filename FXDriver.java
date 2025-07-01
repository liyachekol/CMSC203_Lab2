import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {

    @Override
    public void start(Stage stage) {
        
        FXMainPane root = new FXMainPane();

        
        Scene scene = new Scene(root, 600, 150);

        
        stage.setTitle("GUI Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        
        launch(args);
    }
}
