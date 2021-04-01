package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Share;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("AppMain");
		Share.stackPane= (StackPane) FXMLLoader.load(Main.class.getResource("main_scene.fxml"));
		Scene scene = new Scene(Share.stackPane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(350);
		primaryStage.setHeight(550);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
