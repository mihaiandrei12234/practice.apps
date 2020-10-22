import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class CalculatorSmecher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent parent = fxmlLoader.load(new FileInputStream("calculator.fxml"));

        Scene scene = new Scene(parent, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        Button button = (Button) parent.lookup("#butonulmeu");
        TextField textField1 = (TextField) parent.lookup("#label1");
        TextField textField2 = (TextField) parent.lookup("#label2");
        Label label3 = (Label) parent.lookup("#label3");

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label3.setText(String.valueOf(Integer.parseInt(textField1.getText())+Integer.parseInt(textField2.getText())));
            }
        });
    }
}
