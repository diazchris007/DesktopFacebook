package view;

import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginView extends Scene{
	Label userIdLabel;
	Label pswdLabel;
	TextField userIdText;
	PasswordField pswdText;
	Button authenticate;
	GridPane root;
	public LoginView(GridPane root, double width, double height) {
		super(root, width, height);
		// TODO Auto-generated constructor stub
		this.root = root;
	    userIdLabel = new Label("User Id:");
		pswdLabel = new Label("Password:");
		userIdText = new TextField();
		pswdText = new PasswordField();
		authenticate = new Button("Log In");
		userIdText.setPromptText("Enter User Id");
		pswdText.setPromptText("Enter Password");
		root.add(userIdLabel, 0, 0);
		root.add(pswdLabel, 0, 1);
		root.add(userIdText, 1, 0);
		root.add(pswdText, 1, 1);
		root.add(authenticate, 1, 2,2,2);
	}
	public void addLoginActionListener(EventHandler<ActionEvent> value){
		authenticate.setOnAction(value);
	}
	public String getLoginText(){
		return userIdText.getText();
	}
	public String getPasswordText(){
		return pswdText.getText();
	}

}
