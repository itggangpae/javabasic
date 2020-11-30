package chap18;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class ChartController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart<String,Number> barChart;
	@FXML private AreaChart<String,Number> areaChart;

	final static String austria = "Austria";
	final static String brazil = "Brazil";
	final static String france = "France";
	final static String italy = "Italy";
	final static String usa = "USA";

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT", 10),		
				new PieChart.Data("Swing", 30),
				new PieChart.Data("SWT", 25),
				new PieChart.Data("JavaFX", 35)
				));


		XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
		series1.setName("2013");       
		series1.getData().add(new XYChart.Data<String,Number>(austria, 25601.34));
		series1.getData().add(new XYChart.Data<String,Number>(brazil, 20148.82));
		series1.getData().add(new XYChart.Data<String,Number>(france, 10000));
		series1.getData().add(new XYChart.Data<String,Number>(italy, 35407.15));
		series1.getData().add(new XYChart.Data<String,Number>(usa, 12000));      

		XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
		series2.setName("2014");
		series2.getData().add(new XYChart.Data<String,Number>(austria, 57401.85));
		series2.getData().add(new XYChart.Data<String,Number>(brazil, 41941.19));
		series2.getData().add(new XYChart.Data<String,Number>(france, 45263.37));
		series2.getData().add(new XYChart.Data<String,Number>(italy, 117320.16));
		series2.getData().add(new XYChart.Data<String,Number>(usa, 14845.27));  

		XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
		series3.setName("2015");
		series3.getData().add(new XYChart.Data<String,Number>(austria, 45000.65));
		series3.getData().add(new XYChart.Data<String,Number>(brazil, 44835.76));
		series3.getData().add(new XYChart.Data<String,Number>(france, 18722.18));
		series3.getData().add(new XYChart.Data<String,Number>(italy, 17557.31));
		series3.getData().add(new XYChart.Data<String,Number>(usa, 92633.68));  


		barChart.getData().add(series1);
		barChart.getData().add(series2);
		barChart.getData().add(series3);

		XYChart.Series <String,Number>series4 = new XYChart.Series<String,Number>();
		series4.setName("평균온도");       
		series4.setData(FXCollections.observableArrayList(
				new XYChart.Data<String, Number>("2015", 13),
				new XYChart.Data<String, Number>("2016", 6),
				new XYChart.Data<String, Number>("2017", 22),
				new XYChart.Data<String, Number>("2018", 19)
				));
		areaChart.getData().add(series4);
	}
}

