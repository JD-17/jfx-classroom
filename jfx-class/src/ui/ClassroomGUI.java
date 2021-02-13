package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import model.Classroom;

public class ClassroomGUI {
	
	private Classroom classroom;
    
    public ClassroomGUI (Classroom c) {
    	classroom = c;
    }
    
    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPhoto;

    @FXML
    private RadioButton maleBtn;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton femaleBtn;

    @FXML
    private RadioButton otherBtn;

    @FXML
    private CheckBox softwareChk;

    @FXML
    private CheckBox telematicChk;

    @FXML
    private CheckBox industrialChk;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ChoiceBox<?> browserChBox;

    @FXML
    private PasswordField txtPassword;
    
    @FXML 
    public AnchorPane anchorPane;

    @FXML
    private PasswordField PasswordLogIn;

    @FXML
    private TextField usernameLogIn;
    
    
    @FXML
    void browsePhoto(ActionEvent event) {

    }

    @FXML
    void logInBtn(ActionEvent event) {

    }

    @FXML
    void signUpBtn(ActionEvent event) {

    }

    @FXML
    void createAccount(ActionEvent event) {

    }

    @FXML
    void signInBtn(ActionEvent event) {

    }

}
