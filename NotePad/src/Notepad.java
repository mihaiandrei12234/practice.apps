import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notepad extends Application {
    String memory;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Alege");
        MenuItem menuItemCut = new MenuItem("Cut");
        MenuItem menuItemCopy = new MenuItem("Copy");
        MenuItem menuItemPaste = new MenuItem("Paste");
        menu.getItems().addAll(menuItemCopy, menuItemCut, menuItemPaste);
        menuBar.getMenus().add(menu);

        TextArea textArea = new TextArea();

        menuItemCut.setOnAction(e -> {
            String selectedText = textArea.getSelectedText();
            memory = selectedText;
            String allText = textArea.getText();
            String newText = allText.replace(selectedText, "");
            textArea.setText(newText);
        });

        menuItemPaste.setOnAction(e -> {
            String existingText = textArea.getText();
            int caretPosition= textArea.getCaretPosition();
            String part1=existingText.substring(0,caretPosition);
            String part2=existingText.substring(caretPosition,existingText.length());

            String finalText=part1+memory+part2;
            textArea.setText(finalText);
        });

        menuItemCopy.setOnAction(e->{
            String selectedText=textArea.getSelectedText();
            memory=selectedText;

        });

        vBox.getChildren().addAll(menuBar, textArea);
        Scene scene = new Scene(vBox, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
