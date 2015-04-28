package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class Control {
	private static final int Year;
	ObservableList<String> Month = FXCollections.observableArrayList("January", "February","March","April","May","June","July","August","September","October","November","December");
	ObservableList<String> Day = FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30");
	ObservableList<String> Day1 = FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30", "31");
	ObservableList<String> Day2 = FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28");
	ObservableList<String> Day3 = FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29");
	ObservableList<int>  Year = FXCollections.observableArrayList(2011,2012,2013,2014, 2015, 2016, 2017, 2018, 2019);

	
	@FXML
	private ComboBox<String> MonthComboBox = new ComboBox<String>(Month);
	@FXML
	private ComboBox<String> DayComboBox = new ComboBox<String>(Day);
	@FXML
	private ComboBox<String> YearComboBox = new ComboBox<String>();
	
	if (Month == ("January") || Month == ("March") || Month == ("May") || Month == ("July") || Month == ("August") || Month == ("October")||Month == ("December")){
		@FXML
		private ComboBox<String> DayComboBox1 = new ComboBox<String>(Day1);
	}
	boolean isLeapYear = ((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0));
	if (Month == "February"){
		if isLeapYear == true{
			@FXML
			private ComboBox<String> DayComboBox2 = new ComboBox<String>(Day2);
		}
		else{
			@FXML
			private ComboBox<String> DayComboBox3 = new ComboBox<String>(Day3);
		}
		
	}

}

