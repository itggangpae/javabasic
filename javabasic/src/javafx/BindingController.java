package javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class BindingController implements Initializable {
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		textArea1.textProperty().bind(textArea2.textProperty());
	}
}
