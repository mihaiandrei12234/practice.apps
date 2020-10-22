import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.sql.Statement;

public class TodoManagerPage {

    public void  build(Stage stage){
        GridPane gridPane=new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.setAlignment(Pos.BASELINE_CENTER);
        gridPane.setPadding(new Insets(30, 0, 0, 0));
        TextField todo=new TextField();
        ListView<String> todos=new ListView<>();
        Button add=new Button("Adauga");
        add.setOnMouseClicked(e->{
            String todotext=todo.getText();

            try {
                Statement st=Storage.connection.createStatement();
                String query=String.format(
                    "insert into todo values(null, %s, '%s')",
                    Storage.userId,
                    todotext
                );
                st.executeUpdate(query);
                todos.getItems().add(todotext);
                todo.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
      gridPane.add(todo,0,0);
      gridPane.add(add,1,0);

        Button delete=new Button("Stergere");
        gridPane.add(todos,0,1);
        gridPane.add(delete,1,1);

        Scene scene=new Scene(gridPane,600,600);
        stage.setScene(scene);

    }
}
