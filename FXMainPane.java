import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMainPane extends VBox {

   
    private Button helloButton, howdyButton, chineseButton, clearButton, exitButton;
    private Label feedbackLabel;
    private TextField feedbackField;

    
    private HBox buttonBox, textBox;

    
    private DataManager dataManager;

   
    public FXMainPane() {
        
        helloButton = new Button("Hello");
        howdyButton = new Button("Howdy");
        chineseButton = new Button("Chinese");
        clearButton = new Button("Clear");
        exitButton = new Button("Exit");

        feedbackLabel = new Label("Feedback:");
        feedbackField = new TextField();
        feedbackField.setEditable(false);

      
        buttonBox = new HBox(10);  
        textBox = new HBox(10);   

        
        dataManager = new DataManager();

       
        buttonBox.getChildren().addAll(helloButton, howdyButton, chineseButton, clearButton, exitButton);

        
        textBox.getChildren().addAll(feedbackLabel, feedbackField);

        
        this.getChildren().addAll(buttonBox, textBox);

      
        helloButton.setOnAction(e -> feedbackField.setText(dataManager.getHello()));
        howdyButton.setOnAction(e -> feedbackField.setText(dataManager.getHowdy()));
        chineseButton.setOnAction(e -> feedbackField.setText(dataManager.getChinese()));
        clearButton.setOnAction(e -> feedbackField.setText(""));
        exitButton.setOnAction(e -> System.exit(0));
    }
}