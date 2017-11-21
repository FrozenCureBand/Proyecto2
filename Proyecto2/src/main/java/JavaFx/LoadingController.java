package JavaFx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoadingController implements Initializable{
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView LogoDisplay;

    @FXML
    private ImageView loading;
    
    @FXML
    private Button start;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//loading.setVisible(false);
	}
	
	public void iniciar(ActionEvent event) throws IOException {
		//start.setVisible(false);
		//esperar();
		//loading.setVisible(true);
		//esperar();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1)); 
		start.setVisible(false);
		Stage stage1 = (Stage) start.getScene().getWindow();
		stage1.hide();
		stage.show();
	}
	public void esperar() {
		long mTime = System.currentTimeMillis();
		long end = mTime + 5000; 
		while (mTime < end) 
		{
		    mTime = System.currentTimeMillis();
		}
	}
		
  }

