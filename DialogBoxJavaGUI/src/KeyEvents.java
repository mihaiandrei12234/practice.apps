import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyEvents extends Application {
    int counter = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        TextField textField = new TextField();
        vBox.getChildren().add(textField);

        textField.setOnMouseClicked(e -> {
            System.out.println("S-a apasat");
        });

        textField.setOnKeyPressed(e -> {
            counter++;
        });
        Thread thread=new Thread(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Ai viteza de"+counter/10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        Scene scene = new Scene(vBox, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
