import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Spanjuratoarea extends Application {

    ArrayList<String> words = new ArrayList<>();
    int round=1;
    int numberOfCorrectChars=0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        words.add("Java");
        words.add("Dacia");
        words.add("Presedinte");
        words.add("Calculator");
        words.add("Masina");
        words.add("Raluca");


        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(40, 40, 40, 40));
        Group group = new Group();

        Line line1 = new Line();
        line1.setStartX(100);
        line1.setStartY(50);
        line1.setEndX(100);
        line1.setEndY(200);

        Line line2 = new Line();
        line2.setStartX(50);
        line2.setStartY(200);
        line2.setEndX(150);
        line2.setEndY(200);

        Line line3 = new Line();
        line3.setStartX(100);
        line3.setStartY(50);
        line3.setEndX(200);
        line3.setEndY(50);

        Line line4 = new Line();
        line4.setStartX(200);
        line4.setStartY(50);
        line4.setEndX(200);
        line4.setEndY(70);

        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setCenterX(200);
        circle.setCenterY(90);

        Line line5 = new Line();
        line5.setStartX(200);
        line5.setStartY(110);
        line5.setEndX(200);
        line5.setEndY(160);

        Line line6 = new Line();
        line6.setStartX(200);
        line6.setStartY(160);
        line6.setEndX(230);
        line6.setEndY(190);

        Line line7 = new Line();
        line7.setStartX(200);
        line7.setStartY(160);
        line7.setEndX(170);
        line7.setEndY(190);

        Line line8 = new Line();
        line8.setStartX(200);
        line8.setStartY(135);
        line8.setEndX(230);
        line8.setEndY(150);

        Line line9 = new Line();
        line9.setStartX(200);
        line9.setStartY(135);
        line9.setEndX(170);
        line9.setEndY(150);

        group.getChildren().addAll(line1, line2, line3, line4, circle, line5, line6, line7, line8, line9);
        TextField textField = new TextField();


        HBox hBoxWord = new HBox();
        hBoxWord.setSpacing(20);
        hBoxWord.setAlignment(Pos.BASELINE_CENTER);

        //generam un numar random intre 0 si words.size
        int wordIntex = (int) (Math.random() * words.size());
        String wordToGuess = words.get(wordIntex);

        for (int i = 0; i < wordToGuess.length(); i++) {
            Label label = new Label("_");
            hBoxWord.getChildren().add(label);
        }

        textField.setOnKeyReleased(e -> {
            if (textField.getText().length() > 1) {
                textField.setText(textField.getText().substring(0, 1));
            }
            if (e.getCode() == KeyCode.ENTER) {
               String userInput= textField.getText();
               boolean found=false;
                for (int i = 0; i < wordToGuess.length(); i++) {
                    String currentchar= wordToGuess.charAt(i)+"";
                    if(currentchar.equalsIgnoreCase(userInput)){
                       Label labelCurrentChar=(Label) hBoxWord.getChildren().get(i);
                       labelCurrentChar.setText(currentchar);
                       numberOfCorrectChars++;
                       found=true;
                    }
                }
                if(!found){
                    group.getChildren().remove(group.getChildren().size()-1);
                    if(round==6){
                        Alert lostAler=new Alert(Alert.AlertType.ERROR);
                        lostAler.setHeaderText("Ai pierdut");
                        lostAler.setContentText("Mai incearca o data ");
                        lostAler.show();
                    }
                    round++;
                }
                textField.setText("");
                if(numberOfCorrectChars==wordToGuess.length()){
                    Alert winAlert=new Alert(Alert.AlertType.INFORMATION);
                    winAlert.setHeaderText("Ai castigat");
                    winAlert.setContentText("Esti cel mai tare ");
                    winAlert.show();


                }
            }

        });


        vBox.getChildren().addAll(group, textField, hBoxWord);
        Scene scene = new Scene(vBox, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
