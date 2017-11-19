package view;

import controller.LoginController;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.LoginModel;

public class Gui extends Application {

	// give the controller a gui 
	//then the gui getters and setter for different scenes and stage
	// and you can pass in itself to the controller
	Stage primaryStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		LoginView login = new LoginView(new GridPane(), 300, 300);
		LoginModel lModel = new LoginModel("Christian", "Diaz");
		LoginController lController = new LoginController(lModel, login);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(login);
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	public Stage getStage(){
		return primaryStage;
	}
	
}
