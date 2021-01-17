package kadai.kadai12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    Phase phase = Phase.EnteringFirst;

    CalculatorLabel subLabel = new CalculatorLabel();

    Label operatorLabel = new Label("");
    CalculatorLabel mainLabel = new CalculatorLabel();

    Button clearButton = clearBtnInit();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane numbers = new GridPane();

        numbers.addRow(0, subLabel);
        numbers.addRow(1, mainLabel);
        numbers.addRow(2, numBtnInit(7), numBtnInit(8), numBtnInit(9), opeBtnInit("+"));
        numbers.addRow(3, numBtnInit(4), numBtnInit(5), numBtnInit(6), opeBtnInit("-"));
        numbers.addRow(4, numBtnInit(1), numBtnInit(2), numBtnInit(3), opeBtnInit("×"));
        numbers.addRow(5, numBtnInit(0), clearButton, equalBtnInit(), opeBtnInit("÷"));

        numbers.getStyleClass().add("gridpane");

        GridPane main = new GridPane();

        main.addRow(0, operatorLabel, mainLabel);

        VBox root = new VBox();
        root.getChildren().addAll(subLabel, main, numbers);

        Scene scene = new Scene(root);

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    Button numBtnInit(int n) {
        Button b = new Button((String.valueOf(n)));
        b.setOnAction((event) -> enterNumber(n));
        return b;
    }

    Button opeBtnInit(String o) {
        Button b = new Button(o);
        b.setOnAction((event) -> enteredOperator(o));
        return b;
    }

    Button clearBtnInit() {
        Button b = new Button("ac");
        b.setOnAction((event) -> clear());
        return b;
    }

    Button equalBtnInit() {
        Button b = new Button("=");
        b.setOnAction((event) -> equal());
        return b;
    }

    void enterNumber(int n) {
        if (phase == Phase.EnteredOperator) {
            phase = Phase.EnteringSecond;
        }
        mainLabel.setNumber(mainLabel.getText() + n);
        clearButton.setText("c");
    }

    void enteredOperator(String o) {
        if (phase == Phase.EnteringSecond) {
            equal();
        }

        if (phase != Phase.Answered) {
            subLabel.setNumber(mainLabel.getText());
        }
        mainLabel.setNumber("0");

        operatorLabel.setText(o);

        phase = Phase.EnteredOperator;
    }

    void clear() {
        if (clearButton.getText().equals("c")) {
            mainLabel.setNumber("0");
            clearButton.setText("ac");
        } else {
            subLabel.setNumber("0");
            mainLabel.setNumber("0");
            operatorLabel.setText("");
            phase = Phase.EnteringFirst;
        }
    }

    void equal() {
        if (phase == Phase.EnteringSecond) {
            double f = parseDouble(subLabel.getText());
            double s = parseDouble(mainLabel.getText());

            switch (operatorLabel.getText()) {
                case "+" -> subLabel.setNumber(String.valueOf(f + s));
                case "-" -> subLabel.setNumber(String.valueOf(f - s));
                case "×" -> subLabel.setNumber(String.valueOf(f * s));
                case "÷" -> subLabel.setNumber(String.valueOf(f / s));
            }

            mainLabel.setNumber("0");
            operatorLabel.setText("");
            phase = Phase.Answered;
            clearButton.setText("ac");
        }
    }

    double parseDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }
}

class CalculatorLabel extends Label {
    public CalculatorLabel() {
        super();
        setText("0");
    }

    public void setNumber(String s) {
        try {
            double n = Double.parseDouble(s);
            if (n % 1 == 0) {
                setText(String.valueOf((int) n));
            } else {
                setText(String.valueOf(n));
            }
        } catch (NumberFormatException ignored) {
        }
    }
}

enum Phase {
    EnteringFirst,
    EnteredOperator,
    EnteringSecond,
    Answered
}
