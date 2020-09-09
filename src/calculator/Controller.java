package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    public TextField textField;

    public void btnClickNum(ActionEvent actionEvent) {
        String number = ((Button) actionEvent.getSource()).getText();
        textField.appendText(number);
        System.out.println(number);
    }

    public void btnClickLogic(ActionEvent actionEvent) {
        String logic = ((Button) actionEvent.getSource()).getText();
        textField.appendText(logic);
        System.out.println(logic);
    }

    public void btnClickEqual(ActionEvent actionEvent) {
        String getText = textField.getText();
        String[] operators = getText.split("[0-9]+");
        String[] numbers = getText.split("[+-/*]");
        int result = Integer.parseInt(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (operators[i].equals("+")) {
                result += Integer.parseInt(numbers[i]);
            } else if (operators[i].equals("-")) {
                result -= Integer.parseInt(numbers[i]);
            } else if (operators[i].equals("/")) {
                result /= Integer.parseInt(numbers[i]);
            } else {
                result *= Integer.parseInt(numbers[i]);
            }

        }

        System.out.println(getText + "=" + result);
        textField.clear();
        textField.appendText(String.valueOf(result));
    }

    public void btnClicklDel(ActionEvent actionEvent) {
        textField.clear();
    }

    public void btnClickC(ActionEvent actionEvent) {
        String getText = textField.getText();
        getText = getText.substring(0, getText.length() - 1);
        textField.clear();
        textField.appendText(String.valueOf(getText));
    }
}
