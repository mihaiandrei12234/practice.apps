import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Dialogs extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Esti sigur?");
        alert.setContentText("Sigur sigur?");

        ButtonType userOption=alert.showAndWait().get();
        if(userOption==ButtonType.CANCEL){
            System.out.println("Utilizatorul nu este de acord");
        }
        if(userOption==ButtonType.OK){
            System.out.println("Este de acord");
        }

   primaryStage.show();
    }
}
