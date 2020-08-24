package My_Work.java_3_advance_java_Marcisz_Patryk.ex_5_exchange;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class CurrencyGui extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        HBox root = new HBox();
        Label simpleLabel = new Label("Podaj imię");
        TextField textField = new TextField();
        Button button = new Button("Przetwórz dane");
        button.setOnAction(e -> simpleLabel.setText(textField.getText()));
        root.getChildren().addAll(simpleLabel, textField, button);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        Application.launch(CurrencyGui.class);
    }
}
