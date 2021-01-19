package kadai.kadai11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Kadai11_3_App extends Application {
    @Override
    public void start(Stage pstage) {
        GridPane numbers = new GridPane();

        numbers.addRow(0, numBtnInit(7), numBtnInit(8), numBtnInit(9), opeBtnInit("+"));
        numbers.addRow(1, numBtnInit(4), numBtnInit(5), numBtnInit(6), opeBtnInit("-"));
        numbers.addRow(2, numBtnInit(1), numBtnInit(2), numBtnInit(3), opeBtnInit("×"));
        numbers.addRow(3, numBtnInit(0), clearBtnInit(), equalBtnInit(), opeBtnInit("÷"));

        numbers.getStyleClass().add("gridpane");


        GridPane main = new GridPane();

        main.addRow(0, new Label());

        VBox root = new VBox();
        root.getChildren().addAll(main, numbers);

        Scene scene = new Scene(root);

        pstage.setTitle("Calculator");
        pstage.setScene(scene);
        pstage.show();
    }

    Button numBtnInit(int n) {
        return new Button((String.valueOf(n)));
    }

    Button opeBtnInit(String o) {
        return new Button(o);
    }

    Button clearBtnInit() {
        return new Button("ac");
    }

    Button equalBtnInit() {
        return new Button("=");
    }
}
