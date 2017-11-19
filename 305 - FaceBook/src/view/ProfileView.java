package view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ProfileView extends Scene {

	Image profilePicture;
	BorderPane root;
	public ProfileView(BorderPane root, String picturePath) {
		super(root,450,450);
		Image profilePicture = new Image("file:./download.jpg");
		ImageView p = new ImageView(profilePicture);
		root.setLeft(p);
	}

}
