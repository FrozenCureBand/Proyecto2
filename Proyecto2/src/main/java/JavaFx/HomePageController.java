package JavaFx;

import java.io.File;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import gt.url.edu.demoestructuras.graphviz.FileLoader;
public class HomePageController {

	@FXML
    private ListView files;

    @FXML
    private Button SelectFile;

    @FXML
    private Button Load;
    @FXML
    public Scanner sc;
    public void choosefile(ActionEvent event) {
    	
    	FileChooser filechooser = new FileChooser();
    	filechooser.getExtensionFilters()
        .addAll(
            new FileChooser.ExtensionFilter("TXT files (*.TXT)", "*.TXT"),
            new FileChooser.ExtensionFilter("txt files (*.txt)", "*.txt"));
    	File selectedFile = filechooser.showOpenDialog(null);
    	
    	if (selectedFile != null) {
			files.getItems().add(selectedFile.getName());
		}else {
			System.out.println("Archivo no valido");
		}
    	
    	FileLoader objfl = new FileLoader();
        objfl.loadFileWithJava8(selectedFile);
    }

}
