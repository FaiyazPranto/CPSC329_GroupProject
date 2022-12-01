package application;


import java.io.*;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class LevelsController<option1> {
	int a = 12;

	public String string8[][] = GameController.get_array();
	/**
	 * File quest_file = new File("src/application/Level8Q.txt");
	 * BufferedReader br = new BufferedReader(new FileReader(quest_file));
	 * String line;
	 * int j = 0;
	 **/
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
	private ProgressBar progressBar;

	int i = 1;
	boolean check = false;
	int q_num = 1;
	static int level_point=0;

	static int get_point() {
		return level_point;
	}


	public LevelsController() throws FileNotFoundException {

	}

	@FXML
	void go_next(ActionEvent event) throws IOException {
		if (check == true) {
			//if (option1.isSelected() || option2.isSelected() || option3.isSelected() || option4.isSelected()) {
				Hint_box.clear();

				/**
				 while ((line = br.readLine()) != null) {
				 String[] question_array = line.split(",");
				 string8[j] = question_array;
				 j++;
				 }
				 **/

				if (i < string8.length) {
					Question_label.setText(string8[i][0]);
					option1.setText(string8[i][1]);
					option2.setText(string8[i][2]);
					option3.setText(string8[i][3]);
					option4.setText(string8[i][4]);
					i++;
					if(i == string8.length){
						Next_button.setText("End");
					}

				}else{
					GameController.seto_point(a);
				}

				check = false;
				q_num++;
				//progressBar.setProgress(q_num/(string8.length-1));

				option1.setSelected(false);
				option2.setSelected(false);
				option3.setSelected(false);
				option4.setSelected(false);


			 /*else {
				Hint_box.setText("Please Select an option!!");
			}*/
		} else {
			Hint_box.setText("Please click submit first!!");
		}

	}


	@FXML
	void validate(ActionEvent event) {
		if (option1.isSelected() == false && option2.isSelected() == false && option3.isSelected() == false && option4.isSelected() == false) {
			Hint_box.setText("please select an option to validate!!");

		} else if ((option1.isSelected() && option2.isSelected()) || (option1.isSelected() && option3.isSelected()) || (option1.isSelected() && option4.isSelected()) || (option2.isSelected() && option3.isSelected()) || (option2.isSelected() && option4.isSelected()) || (option3.isSelected() && option4.isSelected())) {
			Hint_box.setText("Please choose one option only!!");
		} else if (check == false){
			String correct = string8[i-1][5];
			if (option1.isSelected()) {
				if (option1.getText().equals(correct)) {
					Hint_box.setText("CORRECT!!\n" + string8[i - 1][6]);
					level_point+=2;
				} else {
					Hint_box.setText("WRONG!!\n" + string8[i - 1][6]);
				}
			}
			if (option2.isSelected()) {
				if (option2.getText().equals(correct)) {
					Hint_box.setText("CORRECT!!\n" + string8[i-1][6]);
					level_point+=2;
				} else {
					Hint_box.setText("WRONG!!\n" + string8[i - 1][6]);
				}
			}
			if (option3.isSelected()) {
				if (option3.getText().equals(correct)) {
					Hint_box.setText("CORRECT!!\n" + string8[i - 1][6]);
					level_point+=2;
				} else {
					Hint_box.setText("WRONG!!\n" + string8[i - 1][6]);
				}
			}
			if (option4.isSelected()) {
				if (option4.getText().equals(correct)) {
					Hint_box.setText("CORRECT!!\n" + string8[i - 1][6]);
					level_point+=2;
				} else {
					Hint_box.setText("WRONG!!\n" + string8[i - 1][6]);
				}
			}
			check = true;
		}
	}

	@FXML
	void give_hint(ActionEvent event) {

	}

}

