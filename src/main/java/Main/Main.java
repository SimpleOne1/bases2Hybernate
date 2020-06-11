package Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;
public class Main extends Application {

    public static void main(String[] args) throws SQLException{
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("/mainMenu.fxml"));
        primaryStage.setTitle("Plants database");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();

    }
}
