package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Date;
import java.util.Random;


public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    Random random = new Random();

    public void onClickBtnSend(ActionEvent actionEvent) {
        int x = random.nextInt(1000);

        textArea.appendText("Anonim" + x + " " + new Date().toString() + ": " + textField.getText() + "\n");
        textField.requestFocus();
        textField.clear();
    }
}
