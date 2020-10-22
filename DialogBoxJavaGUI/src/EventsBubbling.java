import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventsBubbling extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        Button button = new Button("Apasa");
        button.setOnAction(e -> {
            System.out.println("S-a apasat pe buton");
        });

        vBox.getChildren().add(button);

        Scene scene = new Scene(vBox, 600, 600);
        scene.setOnMouseClicked(e -> {
            System.out.println("S-a apasat pe scena");

        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
