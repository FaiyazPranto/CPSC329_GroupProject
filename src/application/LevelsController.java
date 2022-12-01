package application;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class LevelsController {
	
	public String string8[][] = new String[20][8];
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
	    
	    int i = 0;
	    @FXML
	    void go_next(ActionEvent event) throws FileNotFoundException {
	    	if(option1.isSelected() || option2.isSelected() || option3.isSelected() || option4.isSelected()) {
	    	Hint_box.clear();
	    	
	    	if(i == 0) {
	   
	    		File quest_file = new File("src/application/Level8Q.txt");
	    		Scanner file_reader = new Scanner(quest_file);
	    		int j = 0;
	    		while(file_reader.hasNextLine()) {
	    			String question = file_reader.nextLine();
	    			String[] question_array = question.split(",");
	    			string8[j] = question_array;
	    			j++;
	    		}
	    		Question_label.setText(string8[0][0]);
	    		option1.setText(string8[0][1]);
	    		option2.setText(string8[0][2]);
	    		option3.setText(string8[0][3]);
	    		option4.setText(string8[0][4]);
	    		i++;
	    	}
	    	else if(i < string8.length){
	    		Question_label.setText(string8[i][0]);
		    	option1.setText(string8[i][1]);
		    	option2.setText(string8[i][2]);
		    	option3.setText(string8[i][3]);
		    	option4.setText(string8[i][4]);
		    	i++;
	    			
	    		}
	    	}
	    	else {
	    		Hint_box.setText("Please Select an option!!");
	    	}
	    	
	  
	    	}
	    
	    

	    @FXML
	    void validate(ActionEvent event) {
	    	if(option1.isSelected() == false && option2.isSelected() == false && option3.isSelected() == false && option4.isSelected() == false) {
	    		Hint_box.setText("please select an option to validate!!");
	    		
	    	}
	    	else if((option1.isSelected() && option2.isSelected()) || (option1.isSelected() && option3.isSelected()) || (option1.isSelected() && option4.isSelected()) || (option2.isSelected() && option3.isSelected()) || (option2.isSelected() && option4.isSelected()) || (option3.isSelected() && option4.isSelected())) {
	    		Hint_box.setText("Please choose one option only!!");
	    	}
	    	else {
	    		String correct = string8[i-1][5];
	    		if(option1.isSelected()) {
	    			if(option1.getText().equals(correct)) {
	    				Hint_box.setText("CORRECT!!\n"+string8[i-1][6]);
	    			}
	    			else {
	    				Hint_box.setText("WRONG!!\n"+string8[i-1][6]);
	    			}
	    		}
	    		if(option2.isSelected()) {
	    			if(option2.getText().equals(correct)) {
	    				Hint_box.setText("CORRECT!!\n"+string8[i-1][6]);
	    			}
	    			else {
	    				Hint_box.setText("WRONG!!\n"+string8[i-1][6]);
	    			}
	    		}
	    		if(option3.isSelected()) {
	    			if(option3.getText().equals(correct)) {
	    				Hint_box.setText("CORRECT!!\n"+string8[i-1][6]);
	    			}
	    			else {
	    				Hint_box.setText("WRONG!!\n"+string8[i-1][6]);
	    			}
	    		}
	    		if(option4.isSelected()) {
	    			if(option4.getText().equals(correct)) {
	    				Hint_box.setText("CORRECT!!\n"+string8[i-1][6]);
	    			}
	    			else {
	    				Hint_box.setText("WRONG!!\n"+string8[i-1][6]);
	    			}
	    		}
	    	}
	    }

	    @FXML
	    void give_hint(ActionEvent event) {

	    }

}
