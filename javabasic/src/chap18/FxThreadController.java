package chap18;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FxThreadController implements Initializable {
	@FXML private Label lblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;

	private boolean stop;
	private int msg;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event->handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}

	public void handleBtnStart(ActionEvent e) {
		stop = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				while(!stop) {
					Platform.runLater(()->{
						lblTime.setText(msg + "");
					});
					msg++;
					try { Thread.sleep(100); } catch (InterruptedException e) {}
				}
			};
		};

		thread.setDaemon(true);
		thread.start();
	}

	public void handleBtnStop(ActionEvent e) {
		stop = true;
	}
}