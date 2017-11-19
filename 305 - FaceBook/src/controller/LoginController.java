package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.LoginModel;
import view.LoginView;
import view.ProfileView;

public class LoginController {
	
	LoginModel lModel;
	LoginView lView;
	ProfileView pView;
	
	public LoginController(LoginModel lModel, LoginView lView,ProfileView pView){
		this.lModel = lModel;
		this.lView = lView;
		this.pView = pView;
		lView.addLoginActionListener(new LoginListener());
	}
	
	class LoginListener implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String user;
			String pw;
			user = lView.getLoginText();
			pw = lView.getPasswordText();
			if(lModel.verify(user, pw)){
				System.out.println("correct Password");
				
			}
			else{
				System.out.println("Something went Wrong");
			}
		}
		
	}
	
}
