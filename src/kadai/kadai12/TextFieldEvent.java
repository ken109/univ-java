package kadai.kadai12;
// LabelとTextField

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextFieldEvent extends Application {
    TextField heightTextField;
    TextField weightTextField;
    Label bmiLabel;

    @Override
    public void start(Stage pstage) {
        heightTextField = new TextField(); //テキストフィールド生成
        weightTextField = new TextField(); //テキストフィールド生成
        bmiLabel = new Label(""); //計算結果表示ラベル

        GridPane root = new GridPane();
        root.addRow(0, new Label("身長"), heightTextField);
        root.addRow(1, new Label("体重"), weightTextField);
        root.addRow(2, new Label("BMI"), bmiLabel);

        root.getStyleClass().add("gridpane");

        Scene scene = new Scene(root);
        scene.getStylesheets().add("textfieldevent.css");

        pstage.setTitle("Calculate BMI");
        pstage.setScene(scene);
        pstage.show();
        //イベントハンドラ
        heightTextField.setOnKeyTyped((event) -> doCalc());
        weightTextField.setOnKeyTyped((event) -> doCalc());
    }

    void doCalc() {
        double height; //身長データ
        double weight; //体重データ

        try { //身長データを取得
            height = Double.parseDouble(heightTextField.getText()); //double型に変換
        } catch (NumberFormatException error) {
            height = 0.0;
        }

        try {
            weight = Double.parseDouble(weightTextField.getText()); //double型に変換
        } catch (NumberFormatException error) {
            weight = 0.0;
        }

        if (height > 0 && weight > 0) {
            double std = weight / Math.pow(height / 100, 2);//標準体重を計算
            bmiLabel.setText(String.format("%.2f", std));//標準体重を表示
        }
    }

}
