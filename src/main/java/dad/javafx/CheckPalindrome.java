package dad.javafx;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindrome extends Application {
	
	private Label resultLabel;
	private Button checkButton;
	private TextField inputTextField;

	public static void main(String[] args) {
		launch(args);

	}
	
	public static boolean isPalindrome(String checkString) {
	    return checkString.equals(new StringBuffer().append(checkString).reverse().toString());
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		inputTextField = new TextField();
		inputTextField.setPromptText("Introduce un nombre:");
		inputTextField.setMaxWidth(150);
		
		checkButton = new Button("Comprobar");
		checkButton.setDefaultButton(true);
		checkButton.setOnAction(e -> showResult(e));
		
		resultLabel = new Label("Introduce una palabra:");
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(resultLabel, inputTextField, checkButton);
		
		Scene scene = new Scene(root, 320, 200);
		
		
		primaryStage.setTitle("CheckPalindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void showResult(ActionEvent e) {
		String nombre = inputTextField.getText();
		
		if (isPalindrome(nombre)) {
			resultLabel.setText("Sí es palíndromo");
			resultLabel.setStyle("-fx-text-fill: green; -fx-font: italic bold 30 sans-serif;");
		} else {
			resultLabel.setText("No es palíndromo");
			resultLabel.setStyle("-fx-text-fill: red; -fx-font: italic bold 30 sans-serif;");
		}
		
		
	}

}
