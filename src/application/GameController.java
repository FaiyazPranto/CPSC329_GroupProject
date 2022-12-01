package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameController {
	
	public String string8[][] = new String[20][8];
	Stage applicationStage;
	
	@FXML
    private Button level5;

    @FXML
    private Button level4;

    @FXML
    private Button level6;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label main_label;

    @FXML
    private Button level1;

    @FXML
    private Button level3;

    @FXML
    private Button level2;
    
    @FXML
    private Label quizCheckBoxErrorLabel;
    
    @FXML
    private Button Submit_button;

    @FXML
    private TextArea Hint_box;

    @FXML
    private CheckBox option3;

    @FXML
    private Button Next_button;

    @FXML
    private CheckBox option4;

    @FXML
    private Button Hint_button;

    @FXML
    private CheckBox option1;

    @FXML
    private CheckBox option2;

    @FXML
    private Label Question_label;

    
    @FXML
    void openLevel1(ActionEvent level1Start) throws Exception {

    	FXMLLoader fxmlLoader = new FXMLLoader();
        VBox child1 = fxmlLoader.load(new FileInputStream("src/application/Level1.fxml"));
        Scene scene1 = new Scene(child1, 600,400);
        
        
		Stage secondaryStage = new Stage();
		secondaryStage.setTitle("Level 1");
		secondaryStage.setScene(scene1);
		secondaryStage.show();
    }

    private Object quizAnswers(Scene level1Scene) {
		return null;
	}

	@FXML
    void openLevel2(ActionEvent event) {

    }

    @FXML
    void openLevel3(ActionEvent event) {

    }

    @FXML
    void openLevel4(ActionEvent event) {

    }



    @FXML
    void openLevel5(ActionEvent event) {

    }
    
    @FXML
    void openLevel6(ActionEvent event) {
    	
    }

    @FXML
    void openLevel7(ActionEvent event) {
    	
    	
    }
    
    @FXML
    void openLevel8(ActionEvent event) throws IOException, IOException {

    	FXMLLoader fxmlLoader = new FXMLLoader();
        VBox child1 = fxmlLoader.load(new FileInputStream("src/application/Level1.fxml"));
        Scene scene1 = new Scene(child1, 700, 600);
        
        
		Stage secondaryStage = new Stage();
		secondaryStage.setTitle("Level 1");
		secondaryStage.setScene(scene1);
		secondaryStage.show();
		
			

    }
    
    @FXML
    void go_next(ActionEvent event) {

    }

    @FXML
    void validate(ActionEvent event) {

    }

    @FXML
    void give_hint(ActionEvent event) {

    }




}
