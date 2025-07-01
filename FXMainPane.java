import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMainPane extends VBox {

    // student Task #2:
    // declare five buttons, a label, and a textfield
    private Button helloButton, howdyButton, chineseButton, clearButton, exitButton;
    private Label feedbackLabel;
    private TextField feedbackField;

    // declare two HBoxes
    private HBox buttonBox, textBox;

    // declare an instance of DataManager
    private DataManager dataManager;

    // The MainPane constructor sets up the entire GUI
    public FXMainPane() {
        // instantiate components
        helloButton = new Button("Hello");
        howdyButton = new Button("Howdy");
        chineseButton = new Button("Chinese");
        clearButton = new Button("Clear");
        exitButton = new Button("Exit");

        feedbackLabel = new Label("Feedback:");
        feedbackField = new TextField();
        feedbackField.setEditable(false);

        // instantiate HBoxes
        buttonBox = new HBox(10);  // spacing between buttons
        textBox = new HBox(10);    // spacing between label and field

        // instantiate DataManager
        dataManager = new DataManager();

        // add buttons to buttonBox
        buttonBox.getChildren().addAll(helloButton, howdyButton, chineseButton, clearButton, exitButton);

        // add label and textfield to textBox
        textBox.getChildren().addAll(feedbackLabel, feedbackField);

        // add both HBoxes to this VBox (the main layout)
        this.getChildren().addAll(buttonBox, textBox);

        // set button actions
        helloButton.setOnAction(e -> feedbackField.setText(dataManager.getHello()));
        howdyButton.setOnAction(e -> feedbackField.setText(dataManager.getHowdy()));
        chineseButton.setOnAction(e -> feedbackField.setText(dataManager.getChinese()));
        clearButton.setOnAction(e -> feedbackField.setText(""));
        exitButton.setOnAction(e -> System.exit(0));
    }
}
