import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class MenuExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader=new FXMLLoader();
        Parent parent= fxmlLoader.load(new FileInputStream("menu.fxml"));

        Scene scene=new Scene(parent,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
