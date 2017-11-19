package model;

public class LoginModel {

	String userId;
	String password;
	public LoginModel(String userId, String password){
		this.userId = userId;
		this.password = password;
	}
	public boolean verify(String userId, String password){
		System.out.println("Receieved: " + userId + " and: " +password);
		if(this.userId.equals(userId)){
			if(this.password.equals(password)){
				return true;
			}
			return false;
		}
		return false;
	}
}
