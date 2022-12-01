module CPSC_329 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
