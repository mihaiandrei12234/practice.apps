import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class TextInputDialogExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog textInputDialog = new TextInputDialog();
        Optional<String> result= textInputDialog.showAndWait();
        System.out.println(result.get());
    }
}
