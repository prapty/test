package love;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("love.fxml"));
        stage.setTitle("Message");
        stage.setScene(new Scene(root, 1600, 1000));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
