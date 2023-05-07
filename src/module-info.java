module PointOfSale {
	requires javafx.controls;
	requires javafx.fxml;
	requires jfoenix;
	requires java.sql;
	requires log4j;
	requires jasperreports;
	

	opens major to javafx.graphics, javafx.fxml;
}
