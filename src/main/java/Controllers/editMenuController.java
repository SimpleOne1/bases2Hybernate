package Controllers;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import Entity.Plant;
import Main.SceneLoader;
import Service.PlantService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class editMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button idChooserButton;

    @FXML
    private TextField idText;

    @FXML
    private TextField nameText;

    @FXML
    private TextField colourText;

    @FXML
    private TextField priceText;

    @FXML
    private TextField sortText;

    @FXML
    private Button changeButton;

    @FXML
    private Button backButton;

    @FXML
    void initialize() {

        backButton.setOnAction(event -> {
            backButton.getScene().getWindow().hide();
            SceneLoader loader = new SceneLoader("/Views/mainMenu.fxml");
            loader.loadPage();
        });
        idChooserButton.setOnAction(event -> {
            PlantService plantService=new PlantService();
            Plant plant1=new Plant(plantService.getByID(new Long(idText.getText())));
            nameText.setText(plant1.getName());
            colourText.setText(plant1.getColour());
            priceText.setText(plant1.getPrice().toString());
            sortText.setText(plant1.getSort());
        });
        changeButton.setOnAction(event -> {
            Plant plant2=new Plant(nameText.getText(),colourText.getText(),new BigDecimal(priceText.getText()),sortText.getText());
            PlantService plantService=new PlantService();
            plantService.update(plant2);
        });


    }
}
