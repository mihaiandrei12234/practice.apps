import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowsEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox vBox=new VBox();
        Scene scene=new Scene(vBox,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();


        primaryStage.setOnCloseRequest(event->{
            System.out.println("Nu ai voie");
            event.consume();
        });
    }
}
