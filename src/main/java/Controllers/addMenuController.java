package Controllers;

import Entity.Plant;
import Main.SceneLoader;
import Service.PlantService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class addMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private TextField sortField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField colourField;

    @FXML
    private Button addButton;

    @FXML
    private Button backButton;

    @FXML
    void initialize() {
        addButton.setOnAction(event -> {
            addButton.getScene().getWindow().hide();
            PlantService plantService = new PlantService();
            plantService.addPlant(new Plant(nameField.getText(), colourField.getText(), new BigDecimal(priceField.getText()),sortField.getText()));
            SceneLoader loader = new SceneLoader("/Views/mainMenu.fxml");
            loader.loadPage();
        });
        backButton.setOnAction(event -> {
            backButton.getScene().getWindow().hide();
            SceneLoader loader = new SceneLoader("/Views/mainMenu.fxml");
            loader.loadPage();
        });
    }
}
