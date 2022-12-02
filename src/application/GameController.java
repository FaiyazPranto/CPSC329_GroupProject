package application;


import java.awt.*;
import java.io.*;
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
	
	public static String[][] string8 = new String[20][8];
    int l;
    String file_p = "src/application/Level%dQ.txt";
    String line;
    int j = 0;
	Stage applicationStage;
    int lvl;
    public static int o_point = 0;
    String points = "Total Score: %d/320";
	
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
    private static Label main_label;

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
    private	Button update_button;

    @FXML
    void update(ActionEvent event) {
    	String update_message = String.format("%d/320", o_point);
    	main_label.setText(update_message); 
    }
    
    public GameController() throws FileNotFoundException {
        this.lvl = lvl;
        this.string8 = string8;
        this.o_point = o_point;
    }

    
    @FXML
    void openLevel8(ActionEvent level1Start) throws Exception {
        lvl = 1;
        l = 8;

        File quest_file = new File(String.format(file_p, l));
        BufferedReader br = new BufferedReader(new FileReader(quest_file));
        while ((line = br.readLine()) != null) {
            String[] question_array = line.split(";");
            string8[j] = question_array;
            j++;
        }
        String path = String.format("src/application/Level%d.fxml", lvl);
        String title = String.format("Level %d", lvl);
    	FXMLLoader fxmlLoader = new FXMLLoader();
        VBox child1 = fxmlLoader.load(new FileInputStream(path));
        Scene scene1 = new Scene(child1, 700,600);


		Stage secondaryStage = new Stage();
		secondaryStage.setTitle(title);
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
    void openLevel1(ActionEvent event) throws IOException, IOException {

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

    public static String[][] get_array(){
        return string8;
    }

    public static void seto_point(int point){
        o_point += point;
        String k = String.format("%d",o_point);
    }





}
