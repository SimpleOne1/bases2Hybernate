package Controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Entity.Plant;
import Main.SceneLoader;
import Service.PlantService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class deleteMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private TextField text;

    @FXML
    private Button idChooserButton;

    @FXML
    private Button deleteButton;

    @FXML
    void initialize() {
        Plant plant=new Plant();
        backButton.setOnAction(event -> {
            backButton.getScene().getWindow().hide();
            SceneLoader loader = new SceneLoader("/Views/mainMenu.fxml");
            loader.loadPage();
        });
        deleteButton.setOnAction(event -> {
            PlantService plantService=new PlantService();
            plantService.remove(plantService.getByID(new Long(text.getText())));
            SceneLoader loader = new SceneLoader("/Views/mainMenu.fxml");
        });

    }
}
