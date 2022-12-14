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
	
	public static String[][] string8;
    int l;
    String file_p = "Resources/Level%dQ.txt";
    String line;
    int j = 0;
	Stage applicationStage;
    int lvl;
    public static int o_point = 0;
    String points = "Total Score: %d/180";
   
    int current1 = 0;
    int current2 = 0;
    int current3 = 0;
    int current4 = 0;
    int current5 = 0;
    int current6 = 0;
    int last_button;
    int update_check = 0;
	
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
    private	Button update_button;
    
 

    @FXML
    void update(ActionEvent event) {
    	update_check = 0;
    	String update_message = String.format("%d/180", o_point);
    	String i_update = String.format("Score: %d/30", LevelsController.get_point());
    	
    	if(current1 == 1 && last_button == 1) {
    		label1.setText(i_update);
    	}
    	else if(current2 == 1 && last_button == 2) {
    		label2.setText(i_update);
    	}
    	else if(current3 == 1 && last_button == 3) {
    		label3.setText(i_update);
    	}
    	else if(current4 == 1 && last_button == 4) {
    		label4.setText(i_update);
    	}
    	else if(current5 == 1 && last_button == 5) {
    		label5.setText(i_update);
    	}
    	else if(current6 == 1 && last_button == 6) {
    		label6.setText(i_update);
    	}
    	main_label.setText(update_message); 
    }
    
    public GameController() throws FileNotFoundException {
        this.lvl = lvl;
        this.string8 = string8;
        this.o_point = o_point;
    }

    
 

    private Object quizAnswers(Scene level1Scene) {
		return null;
	}

	@FXML
    void openLevel2(ActionEvent event) throws IOException {
		if(update_check == 0 && current2 == 0) {
			current2 = 1;
			lvl = 3;
	        l = 3;
	        j = 0;
	        last_button = 2;
	        string8 = new String[15][8];
	
	        File quest_file = new File(String.format(file_p, l));
	        BufferedReader br = new BufferedReader(new FileReader(quest_file));
	        while ((line = br.readLine())!= null) {
	            String[] question_array = line.split(";");
	            string8[j] = question_array;
	            j++;
	        }
	        
	        String path = String.format("src/application/Level%d.fxml", lvl);
	        String title = String.format("Level %d", 2);
	    	FXMLLoader fxmlLoader = new FXMLLoader();
	        VBox child1 = fxmlLoader.load(new FileInputStream(path));
	        Scene scene1 = new Scene(child1, 1000,600);
	
	
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle(title);
			secondaryStage.setScene(scene1);
	
	
			secondaryStage.show();
			update_check = 1;
		}
		
		


    }

    @FXML
    void openLevel3(ActionEvent event) throws IOException, IOException {
    	if(update_check == 0 && current3 == 0) {
    		current3 = 1;
	    	lvl = 5;
	        l = 5;
	        j=0;
	        last_button = 3;
	        string8 = new String[15][8];
	
	        File quest_file = new File(String.format(file_p, l));
	        BufferedReader br = new BufferedReader(new FileReader(quest_file));
	        while ((line = br.readLine())!= null) {
	            String[] question_array = line.split(";");
	            string8[j] = question_array;
	            j++;
	        }
	        br.close();
	        String path = String.format("src/application/Level%d.fxml", lvl);
	        String title = String.format("Level %d", 3);
	    	FXMLLoader fxmlLoader = new FXMLLoader();
	        VBox child1 = fxmlLoader.load(new FileInputStream(path));
	        Scene scene1 = new Scene(child1, 1000,600);
	
	
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle(title);
			secondaryStage.setScene(scene1);
	
	
			secondaryStage.show();
			update_check = 3;
    	}
    	
    }

    @FXML
    void openLevel4(ActionEvent event) throws IOException, IOException {
    	if(update_check == 0 && current4 == 0) {
    		current4 = 1;
	    	lvl = 6;
	        l = 6;
	        j=0; 
	        last_button = 4;
	        string8 = new String[15][8];
	
	        File quest_file = new File(String.format(file_p, l));
	        BufferedReader br = new BufferedReader(new FileReader(quest_file));
	        while ((line = br.readLine())!= null) {
	            String[] question_array = line.split(";");
	            string8[j] = question_array;
	            j++;
	        }
	        br.close();
	        
	        String path = String.format("src/application/Level%d.fxml", lvl);
	        String title = String.format("Level %d", 4);
	    	FXMLLoader fxmlLoader = new FXMLLoader();
	        VBox child1 = fxmlLoader.load(new FileInputStream(path));
	        Scene scene1 = new Scene(child1, 1000,600);
	
	
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle(title);
			secondaryStage.setScene(scene1);
	
	
			secondaryStage.show();
			update_check = 1;
    	}
    	
    }



    @FXML
    void openLevel5(ActionEvent event) throws IOException, IOException {
    	if(update_check == 0 && current5 == 0) {
    		current5 = 1;	
	    	lvl = 7;
	        l = 7;
	        j=0;
	        last_button = 5;
	        string8 = new String[15][8];
	
	        File quest_file = new File(String.format(file_p, l));
	        BufferedReader br = new BufferedReader(new FileReader(quest_file));
	        while ((line = br.readLine())!= null) {
	            String[] question_array = line.split(";");
	            string8[j] = question_array;
	            j++;
	        }
	        br.close();
	        
	        String path = String.format("src/application/Level%d.fxml", lvl);
	        String title = String.format("Level %d", 5);
	    	FXMLLoader fxmlLoader = new FXMLLoader();
	        VBox child1 = fxmlLoader.load(new FileInputStream(path));
	        Scene scene1 = new Scene(child1, 1000,600);
	
	
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle(title);
			secondaryStage.setScene(scene1);
	
	
			secondaryStage.show();
			update_check = 1;
    	}
    	
    }
    
    @FXML
    void openLevel6(ActionEvent event) throws IOException, IOException {
    	if(update_check == 0 && current6 == 0) {
    		current6 = 1;
	    	lvl = 8;
	        l = 8;
	        j=0;
	        last_button = 6;
	        string8 = new String[15][8];
	
	        File quest_file = new File(String.format(file_p, l));
	        BufferedReader br = new BufferedReader(new FileReader(quest_file));
	        while ((line = br.readLine())!= null) {
	            String[] question_array = line.split(";");
	            string8[j] = question_array;
	            j++;
	        }
	        br.close();
	        
	        String path = String.format("src/application/Level%d.fxml", lvl);
	        String title = String.format("Level %d", 6);
	    	FXMLLoader fxmlLoader = new FXMLLoader();
	        VBox child1 = fxmlLoader.load(new FileInputStream(path));
	        Scene scene1 = new Scene(child1, 1000,600);
	
	
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle(title);
			secondaryStage.setScene(scene1);
	
	
			secondaryStage.show();
			update_check = 1;
    	}
    	
    }

   
    
    @FXML
    void openLevel1(ActionEvent event) throws IOException, IOException {
    	
    	if(update_check == 0) {
    		current1 = 1;
	    	lvl = 1;
	        l = 1;
	        j=0;
	        string8 = new String[15][8];
	        last_button = 1;
	
	        File quest_file = new File(String.format(file_p, l));
	        BufferedReader br = new BufferedReader(new FileReader(quest_file));
	        while ((line = br.readLine())!= null) {
	            String[] question_array = line.split(";");
	            string8[j] = question_array;
	            j++;
	        }
	        br.close();
	        
	        String path = String.format("src/application/Level%d.fxml", lvl);
	        String title = String.format("Level %d", lvl);
	    	FXMLLoader fxmlLoader = new FXMLLoader();
	        VBox child1 = fxmlLoader.load(new FileInputStream(path));
	        Scene scene1 = new Scene(child1, 1000,600);
	
	
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle(title);
			secondaryStage.setScene(scene1);
	
	
			secondaryStage.show();
			update_check = 1;
			
    	}
			
    	
			

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
        String n = String.format("%d",point);
    }
    
    public static void deduct() {
    	o_point-=1;
    }
    
    





}
